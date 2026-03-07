package Dominio;

public abstract class Question {
    private String questionId;
    Private String enunciado;
    
public Question ( String questionId, String enunciado){
    this.questionId = questionId;
    this.enunciado = enunciado;
}

public getEnunciado(){
    return enunciado;
}

public abstract boolean esCorrecta(String respuesta); 

    
}