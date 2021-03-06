package com.pouillcorp.sortirnice.recycler.holder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.pouillcorp.sortirnice.App;
import com.pouillcorp.sortirnice.R;
import com.pouillcorp.sortirnice.entities.entry.EntryEntity;
import com.pouillcorp.sortirnice.entities.entry.detail.EntryAtmospherEntity;
import com.pouillcorp.sortirnice.entities.entry.detail.EntryCategoryEntity;
import com.pouillcorp.sortirnice.entities.entry.detail.EntryLocationEntity;
import com.pouillcorp.sortirnice.recycler.adapter.RecyclerAdapterEntriesSauvegarde;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewHolderEntriesSauvegarde extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.titre)
    TextView titre;
    @BindView(R.id.text_categories)
    TextView textCategories;
    @BindView(R.id.text_locations)
    TextView textLocations;
    @BindView(R.id.text_atmospheres)
    TextView textAtmospheres;

    EntryEntity currentEntry;


    private WeakReference<RecyclerAdapterEntriesSauvegarde.Listener> callbackWeakRef;

    public RecyclerViewHolderEntriesSauvegarde(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void updateWithEntries(EntryEntity entry, RecyclerAdapterEntriesSauvegarde.Listener callback)  {
        currentEntry = entry;

        String category = "";
        int i = 1;
        for (EntryCategoryEntity current : entry.getListCategories()) {
            if (!current.getValue().equalsIgnoreCase(App.getRes().getString(R.string.sortir_a_nice))
                    && !current.getValue().equalsIgnoreCase(App.getRes().getString(R.string.toute_boutique))) {
                category += current.getValue();
                if (i < entry.getListCategories().size()) {
                    category += " / ";
                }
            }
            i++;
        }
        String location = "";
        if (entry.getListLocations() != null) {
            int j = 1;
            for (EntryLocationEntity current : entry.getListLocations()) {
                if (!current.getValue().equalsIgnoreCase(App.getRes().getString(R.string.metropole))) {
                    location += current.getValue();
                    if (j < entry.getListLocations().size()) {
                        location += " / ";
                    }
                }
                j++;
            }
        }
        String atmosphere = "";
        if (entry.getListAtmosphere() != null) {
            int k = 1;
            for (EntryAtmospherEntity current : entry.getListAtmosphere()) {
                //if (!current.getValue().equalsIgnoreCase(App.getRes().getString(R.string.metropole))) {
                    atmosphere += current.getValue();
                    if (k < entry.getListAtmosphere().size()) {
                        atmosphere += " / ";
                    }
               // }
                k++;
            }
        }

        this.titre.setText(entry.getNameFr());

        this.textCategories.setText(category);
        this.textLocations.setText(location);
        this.textAtmospheres.setText(atmosphere);

        hideFields();
        this.callbackWeakRef = new WeakReference<RecyclerAdapterEntriesSauvegarde.Listener>(callback);
    }

    public void showAllFields() {
        textCategories.setVisibility(View.VISIBLE);
        textLocations.setVisibility(View.VISIBLE);
        textAtmospheres.setVisibility(View.VISIBLE);
    }

    public void hideFields() {
        showAllFields();
        if (textCategories.getText().toString().equalsIgnoreCase("")) {
            textCategories.setVisibility(View.GONE);
        }
        if (textLocations.getText().toString().equalsIgnoreCase("")) {
            textLocations.setVisibility(View.GONE);
        }
        if (textAtmospheres.getText().toString().equalsIgnoreCase("")) {
            textAtmospheres.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View view) {
        RecyclerAdapterEntriesSauvegarde.Listener callback = callbackWeakRef.get();
        if (callback != null) callback.onClickEntriesButton(getAdapterPosition());
    }
}
