package com.pouillcorp.sortirnice.recycler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.pouillcorp.sortirnice.R;
import com.pouillcorp.sortirnice.modelevents.Event;
import com.pouillcorp.sortirnice.recycler.holder.RecyclerViewHolderEvents;

import java.util.List;

public class RecyclerAdapterEvents extends RecyclerView.Adapter<RecyclerViewHolderEvents> {

        private List<Event> listEvents;

    public interface Listener {
        void onClickEventsButton(int position);
    }

    private final Listener callback;

    public RecyclerAdapterEvents(List<Event> listEvents, Listener callback) {
        this.listEvents = listEvents;
        this.callback = callback;
    }

        @Override
        public RecyclerViewHolderEvents onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
            //View view = inflater.inflate(R.layout.recycler_list_event, parent, false);
            View view = inflater.inflate(R.layout.recycler_list_event_card, parent, false);
            return new RecyclerViewHolderEvents(view);
        }

        @Override
        public void onBindViewHolder(RecyclerViewHolderEvents viewHolder, int position) {
            viewHolder.updateWithEvents(this.listEvents.get(position),this.callback);
        }

        @Override
        public int getItemCount() {
            return this.listEvents.size();
        }

    public Event getEvent(int position){
        return this.listEvents.get(position);
    }
}
