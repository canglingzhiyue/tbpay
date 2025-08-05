package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.iru;

/* loaded from: classes6.dex */
public class ith<MODEL extends iru<? extends a<? extends BaseSearchResult, ?>>> extends ivp<MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private iti d;

    static {
        kge.a(1154814982);
    }

    public static /* synthetic */ Object ipc$super(ith ithVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -789925697) {
            super.a(((Number) objArr[0]).intValue(), (TRecyclerView) objArr[1]);
            return null;
        } else if (hashCode != -603323580) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((itd) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    @Override // tb.ivp, tb.inv, tb.isz, android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, itdVar, new Integer(i)});
        } else {
            a(itdVar, i);
        }
    }

    public ith(ListStyle listStyle, Activity activity, ium iumVar, MODEL model, int i) {
        super(listStyle, activity, iumVar, model, i);
    }

    public void a(iti itiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee55297a", new Object[]{this, itiVar});
        } else {
            this.d = itiVar;
        }
    }

    @Override // tb.ivp, tb.inv, tb.isz
    public void a(itd itdVar, int i) {
        iti itiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0a0344", new Object[]{this, itdVar, new Integer(i)});
            return;
        }
        super.a(itdVar, i);
        if (this.c || (itiVar = this.d) == null) {
            return;
        }
        itiVar.a(j(i), i);
    }

    @Override // tb.ivp, tb.isz
    public void a(int i, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0eab0bf", new Object[]{this, new Integer(i), tRecyclerView});
            return;
        }
        if (this.b < 0) {
            super.a(i, tRecyclerView);
        } else {
            notifyItemRangeInserted(this.b, i);
        }
        h();
    }
}
