package cse.pec.sharon.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
public class ExerciseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyExerciseData[]myExerciseData=new MyExerciseData[]{
                new MyExerciseData("Pushups","find max rep count",R.drawable.e1),
                new MyExerciseData("Jumping jack","Use your glutes,quads",R.drawable.e2),
                new MyExerciseData("Squats","Do only 20 squats daily",R.drawable.e3),
                new MyExerciseData("lunges","Lunges are most populr",R.drawable.e4),
                new MyExerciseData("split jump","Jump lunge",R.drawable.e5),
                new MyExerciseData("Squat jump","Do 20 seconds of squat jumps",R.drawable.e6),
                new MyExerciseData("Squats","Do only 20 squats daily",R.drawable.e6),
                new MyExerciseData("lunges","Lunges are most populr",R.drawable.e4),
                new MyExerciseData("split jump","Jump lunge",R.drawable.e5),
                new MyExerciseData("Squat jump","Do 20 seconds of squat jumps",R.drawable.e3),


        };
        MyExerciseAdapter myExerciseAdapter= new MyExerciseAdapter(myExerciseData,ExerciseList.this);
        recyclerView.setAdapter(myExerciseAdapter);

    }
}