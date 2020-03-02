plain_text = "Bring your vision of Computer Science education to life"
key = 13
mode = "encrypt"
SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !?."
encrypted_text = ""
    
for char in plain_text:
  if char in SYMBOLS:
    char_index = SYMBOLS.find(char)
                
    if mode == "encrypt":
      new_index = char_index + key
    elif mode == "decrypt":
      new_index = char_index - key
                    
    if new_index >= len(SYMBOLS):
      new_index = new_index - len(SYMBOLS)
    elif new_index < 0:
      new_index = new_index + len(SYMBOLS)
                    
    encrypted_text += SYMBOLS[new_index]
  
print(encrypted_text)
      