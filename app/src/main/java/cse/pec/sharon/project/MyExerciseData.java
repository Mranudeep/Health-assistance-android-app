package cse.pec.sharon.project;

public class MyExerciseData {
    private String exercisename;
    private String descrip;
    private Integer exerimage;

    public MyExerciseData(String exercisename, String descrip, Integer exerimage) {
        this.exercisename = exercisename;
        this.descrip = descrip;
        this.exerimage = exerimage;
    }

    public String getExercisename() {
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Integer getExerimage() {
        return exerimage;
    }

    public void setExerimage(Integer exerimage) {
        this.exerimage = exerimage;
    }
}
