package Dominio;

public class UniqueChoiceQuestion {

    private String respuestaCorrecta;

 public UniqueChoiceQuestion(String questionId, String enunciado, String respuestaCorrecta) {
    super(questionId,enunciado);
    this.respuestaCorrecta = respuestaCorrecta;
}
@Override
public boolean esCorrecta(String respuesta) {
    return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }
}