package xyz.sahildave.widget.sample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LStopAdapter extends RecyclerView.Adapter<LStopAdapter.MainViewHolder> {
	public List<String> filteredStops;

	private final Context context;


	public LStopAdapter(Context context, List<String> listOfStops) {
		this.context=context;
		filteredStops=listOfStops;

        setHasStableIds(true);
	}

    public class MainViewHolder extends RecyclerView.ViewHolder {
        protected TextView text;

        public MainViewHolder(View view) {
            super(view);

            text = (TextView) view.findViewById(R.id.mytext);
        }
    }

    @Override
    public LStopAdapter.MainViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_stop, viewGroup, false);

        return new MainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MainViewHolder viewHolder, int position) {
        viewHolder.text.setText(filteredStops.get(position));
    }

	@Override
	public long getItemId(int position) {
        return filteredStops.get(position).hashCode();
	}

    @Override
    public int getItemCount() {
        return filteredStops.size();
    }
}