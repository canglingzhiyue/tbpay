package tb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public abstract class med<M> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    private static final String f31034a = "med";

    public med(View view) {
        super(view);
    }

    public med(ViewGroup viewGroup, int i) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
