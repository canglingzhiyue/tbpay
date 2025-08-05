package com.alibaba.android.ultron.vfw.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f2742a;
    private int b;
    private Map<String, Object> c;
    private boolean d;
    private ViewGroup e;
    private IDMComponent f;

    static {
        kge.a(-325806132);
    }

    public h(View view) {
        this(view, null);
    }

    public h(View view, b bVar) {
        super(view);
        this.b = -1;
        this.c = new HashMap();
        this.f2742a = bVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ec0232d4", new Object[]{this}) : this.f2742a;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.itemView;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.e = viewGroup;
        }
    }

    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this}) : this.e;
    }

    public Map<String, Object> a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e55d2d21", new Object[]{this, iDMComponent});
        }
        this.f = iDMComponent;
        this.c.clear();
        this.c.put(d.TAG_DINAMICX_VIEW_COMPONENT, iDMComponent);
        this.c.put(com.alibaba.android.ultron.event.base.f.KEY_TRIGGER_VIEW_HOLDER, this);
        return this.c;
    }

    public IDMComponent f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("68961171", new Object[]{this}) : this.f;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.c;
    }
}
