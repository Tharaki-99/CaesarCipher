object CeasarCipher extends App{
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val S = "This is implementation of Caesar Cipher."
	val encription = S.map( (c: Char) => {
	val E = alphabet.indexOf(c.toUpper)
		if (E == -1){
			c
		}
		else{
			alphabet((E + 1) % alphabet.size)
			}
	});

  val decription = encription.map( (c: Char) => {
    val D = alphabet.indexOf(c.toUpper)
    if (D == -1){
      c
    }
    else{
      alphabet((D - 1) % alphabet.size)
      }
  });
	println("encripted message :" + encription);
  println("decripted message :" + decription);
}
