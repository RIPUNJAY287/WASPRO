package com.example.waspro;

      import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import android.widget.TextView;

      import java.util.ArrayList;
      import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.recyclerview.widget.RecyclerView;
      import de.hdodenhof.circleimageview.CircleImageView;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private ArrayList<person> people;

    public MainAdapter(ArrayList<person> list) {
        people = list;
       // activity = (itemclicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        CircleImageView pic;
        TextView name,surname;

        public ViewHolder(@Nullable View itemview){
            super(itemview);
            name =  itemview.findViewById(R.id.tname);
            surname = itemview.findViewById(R.id.tvdesc);
            pic = itemview.findViewById(R.id.pro_img);

            itemview.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                   // activity.onitemclicked(people.indexOf((person) v.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_list,parent,false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(people.get(position));
        holder.name.setText(people.get(position).getName());
        holder.surname.setText(people.get(position).getDesc());
        holder.pic.setImageResource(R.drawable.profile_icon);


    }


    @Override
    public int getItemCount() {
        return people.size();
    }
}
