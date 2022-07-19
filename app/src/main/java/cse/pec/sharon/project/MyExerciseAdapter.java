package cse.pec.sharon.project;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyExerciseAdapter extends RecyclerView.Adapter<MyExerciseAdapter.ViewHolder>{
    MyExerciseData[]myExerciseData;
    Context context;
    public MyExerciseAdapter(MyExerciseData[]myExerciseData, ExerciseList activity) {
        this.myExerciseData = myExerciseData;
        this.context=activity;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.exer_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyExerciseData myExerciseDataList = myExerciseData[position];
        holder.Ename.setText(myExerciseDataList.getExercisename());
        holder.Eimage.setImageResource(myExerciseDataList.getExerimage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v)
            {
                Toast.makeText(v.getContext(), "clicked", Toast.LENGTH_SHORT).show();

                final  Intent intent=new Intent(v.getContext(),timerActivity.class);
                v.getContext().startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount()
    {
        return myExerciseData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView Eimage;
        TextView Ename;
        TextView descrip;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Eimage = itemView.findViewById(R.id.exerimg);
            Ename = itemView.findViewById(R.id.exername);


      }
    }
}
