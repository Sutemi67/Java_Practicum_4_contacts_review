package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <A extends ListDiffInterface<A>> extends DiffUtil.ItemCallback<A> implements ListDiffInterface<A>{
    @Override
    public boolean areItemsTheSame(@NonNull A a, @NonNull A t1) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(@NonNull A a, @NonNull A t1) {
        return false;
    }

    @Override
    public boolean theSameAs(A a) {
        return false;
    }
}
