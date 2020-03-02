<div class="title-area">
  <img class="pie-chart" src=".guides/img/visualizer-chart.png" />
  <div class="main-title">
    53% of educators are concerned with low levels of student engagement and course satisfaction.
  </div>
</div>

<div class="marketing">
  Allow students to see under the hood of their code with Code Visualizer.
</div>

<iframe class="visualizer" height="80%" frameborder="0" src="https://pythontutor.com/iframe-embed.html#code=plain_text%20%3D%20%22Bring%20your%20vision%20of%20Computer%20Science%20education%20to%20life%22%0Akey%20%3D%2013%0Amode%20%3D%20%22encrypt%22%0ASYMBOLS%20%3D%20%22ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890%20!%3F.%22%0Aencrypted_text%20%3D%20%22%22%0A%20%20%20%20%0Afor%20char%20in%20plain_text%3A%0A%20%20if%20char%20in%20SYMBOLS%3A%0A%20%20%20%20char_index%20%3D%20SYMBOLS.find%28char%29%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20if%20mode%20%3D%3D%20%22encrypt%22%3A%0A%20%20%20%20%20%20new_index%20%3D%20char_index%20%2B%20key%0A%20%20%20%20elif%20mode%20%3D%3D%20%22decrypt%22%3A%0A%20%20%20%20%20%20new_index%20%3D%20char_index%20-%20key%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20if%20new_index%20%3E%3D%20len%28SYMBOLS%29%3A%0A%20%20%20%20%20%20new_index%20%3D%20new_index%20-%20len%28SYMBOLS%29%0A%20%20%20%20elif%20new_index%20%3C%200%3A%0A%20%20%20%20%20%20new_index%20%3D%20new_index%20%2B%20len%28SYMBOLS%29%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20encrypted_text%20%2B%3D%20SYMBOLS%5Bnew_index%5D%0A%20%20%0Aprint%28encrypted_text%29&codeDivHeight=400&codeDivWidth=350&cumulative=false&curInstr=0&heapPrimitives=nevernest&origin=opt-frontend.js&py=3&rawInputLstJSON=%5B%5D&textReferences=false"> </iframe>

<details class="explanation-details"><summary class="explanation-summary">**What is the abovecode doing?**</summary>The code is using something called a Caesar Cipher, which encrypts a message. The cipher works by having a key (in this case 13) and a list of all acceptable characters (uppercase, lowercase, numbers, and punctuation). For each character of plain text, the encrypted equivalent is 13 characters to the left. If the list ends before the 13th character, keep counting from the beginning of the list. Decrypting the text is done in the reverse order (move 13 characters to the right).<img src=".guides/img/cipher_explanation.gif" /></details>

<div class="blurb">
  <ul>
    <li>Help students better understand complex programming concepts like loops, constructors, and recursion</li>
    <li>The visualizer works with Python, Java, JavaScript, C, C++, and Ruby.</li>
    <li>See the Codio <a href="https://www.codio.com/blog/python-tutor-codio-visualizer">blog</a> for more information on our code visualizer.</li>
  </ul>  
</div>

