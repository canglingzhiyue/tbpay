package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.XRateFlowLayout;
import com.taobao.detail.rate.widget.delegate.tag.AssociationTagItemView;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class kqc extends kqd<AssociationTagItem> implements kqh<AssociationTagItem> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context b;
    private final kqe c;
    private HashMap<Integer, kqf> d;
    private int e;

    public static /* synthetic */ Object ipc$super(kqc kqcVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public kqc(Context context, List<AssociationTagItem> list, kqe kqeVar) {
        super(list);
        this.d = new HashMap<>();
        this.e = -1;
        this.b = context;
        this.c = kqeVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b(i);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            a(i, false);
        }
    }

    @Override // tb.kqd
    public View a(XRateFlowLayout xRateFlowLayout, int i, AssociationTagItem associationTagItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("84369e31", new Object[]{this, xRateFlowLayout, new Integer(i), associationTagItem});
        }
        AssociationTagItemView associationTagItemView = new AssociationTagItemView(this.b);
        associationTagItemView.bindData(this.c, c(i), i, this);
        this.d.put(Integer.valueOf(i), associationTagItemView);
        return associationTagItemView;
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (this.e != i) {
            a(i, true);
        } else {
            this.f30233a.a(i, c(i));
        }
    }

    private void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.e = i;
        for (Map.Entry<Integer, kqf> entry : this.d.entrySet()) {
            kqf value = entry.getValue();
            int intValue = entry.getKey().intValue();
            value.setSelectedStatus(i == intValue);
            if (i == intValue && this.f30233a != null && z) {
                this.f30233a.a(i, c(i));
            }
        }
    }

    @Override // tb.kqh
    public void a(int i, AssociationTagItem associationTagItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fe11d7", new Object[]{this, new Integer(i), associationTagItem});
        } else {
            d(i);
        }
    }
}
