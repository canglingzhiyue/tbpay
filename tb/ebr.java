package tb;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class ebr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final DataSetObservable b = new DataSetObservable();
    public ArrayList<ebq> c = new ArrayList<>();

    static {
        kge.a(-1618203020);
    }

    public abstract int a();

    public abstract ebn a(Context context);

    public abstract ebq a(Context context, int i);

    public float b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a7862d4", new Object[]{this, context, new Integer(i)})).floatValue();
        }
        return 1.0f;
    }

    public final void a(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26d9add", new Object[]{this, dataSetObserver});
        } else {
            this.b.registerObserver(dataSetObserver);
        }
    }

    public final void b(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6e921e", new Object[]{this, dataSetObserver});
        } else {
            this.b.unregisterObserver(dataSetObserver);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.notifyChanged();
        }
    }

    public ArrayList<ebq> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this}) : this.c;
    }
}
