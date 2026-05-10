package com.example.bonnus_vieccanlam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private List<Task> taskList;

    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = taskList.get(position);
        if (task == null) return;


        holder.tvTenViec.setText(task.getName());
        holder.tvThoiGian.setText(task.getDate());
    }

    @Override
    public int getItemCount() {
        if (taskList != null) {
            return taskList.size();
        }
        return 0;
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTenViec;
        private TextView tvThoiGian;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTenViec = itemView.findViewById(R.id.tvTenViec);
            tvThoiGian = itemView.findViewById(R.id.tvThoiGian);
        }
    }
}