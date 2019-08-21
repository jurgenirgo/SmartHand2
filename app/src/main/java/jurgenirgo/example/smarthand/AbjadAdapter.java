package jurgenirgo.example.smarthand;

import android.app.AlertDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import jurgenirgo.example.smarthand.Model.AbjadModel;

public class AbjadAdapter extends RecyclerView.Adapter<AbjadAdapter.ViewHolder> {

    Context context;
    ArrayList<AbjadModel> arrayList;

    public AbjadAdapter(Context context, ArrayList<AbjadModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.abjaditem, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final AbjadModel models = arrayList.get(i);
        viewHolder.imageView.setImageDrawable(context.getDrawable(models.getImageAbjad()));

        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                View view = LayoutInflater.from(context).inflate(R.layout.abjadpopup, null);
                ImageView imageView = view.findViewById(R.id.imagepopup);
                imageView.setImageDrawable(context.getDrawable(models.getImageJari()));

                builder.setView(view);

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgperasaan);
        }
    }
}
