package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.OpenLiveSingleRoomVH;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes8.dex */
public class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.sdk.playcontrol.b f21813a;
    private boolean b;
    public ArrayList<IRecyclerModel> d;
    public Context e;
    public e f;
    public RecyclerView.ViewHolder g;
    public RecyclerView.ViewHolder h;
    public String i;
    public String j;
    public long k = 0;
    public SparseArray<C0905a> l = new SparseArray<>();
    public g m;

    /* renamed from: com.taobao.taolive.sdk.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0905a {

        /* renamed from: a  reason: collision with root package name */
        public Class<? extends RecyclerView.ViewHolder> f21814a;
        public int b;

        static {
            kge.a(-909024837);
        }
    }

    static {
        kge.a(1991236150);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1079446313) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        } else if (hashCode == -1066359532) {
            super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
            return null;
        } else if (hashCode != -955520525) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
    }

    public a(Context context) {
        this.e = context;
    }

    public a(Context context, g gVar) {
        this.e = context;
        this.m = gVar;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{this, eVar});
        } else {
            this.f = eVar;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void a(int i, C0905a c0905a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea68592", new Object[]{this, new Integer(i), c0905a});
        } else {
            this.l.put(i, c0905a);
        }
    }

    public void a(ArrayList<IRecyclerModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.d = arrayList != null ? (ArrayList) arrayList.clone() : null;
        this.k = 0L;
    }

    public void a(com.taobao.taolive.sdk.playcontrol.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be387a4", new Object[]{this, bVar});
        } else {
            this.f21813a = bVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        ArrayList<IRecyclerModel> arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.get(i).getViewType();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0905a c0905a = this.l.get(i);
        if (c0905a != null) {
            try {
                RecyclerView.ViewHolder newInstance = c0905a.f21814a.getDeclaredConstructor(View.class).newInstance(LayoutInflater.from(this.e).inflate(c0905a.b, viewGroup, false));
                if ((this.m == null || !(newInstance instanceof j)) && (newInstance instanceof p)) {
                    ((p) newInstance).setGlobalContext(this.f);
                    ((p) newInstance).init();
                    if (this.f21813a != null) {
                        ((p) newInstance).initMultiRoomVideoControllerObserver(this.f21813a);
                    } else if (pmd.a().m() != null) {
                        pmd.a().m().a("VideoView", "BaseListAdapter onCreateViewHolder mMultiRoomVideoControllerObserver = null");
                    }
                }
                return newInstance;
            } catch (Exception e) {
                if (pmd.a().m() == null) {
                    return null;
                }
                pnj m = pmd.a().m();
                m.a("BaseListAdapter", "onCreateViewHolder exception = " + a(e));
                return null;
            }
        } else if (pmd.a().m() == null) {
            return null;
        } else {
            pnj m2 = pmd.a().m();
            m2.a("BaseListAdapter", "onCreateViewHolder VHDefine null viewType = " + i);
            return null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        IRecyclerModel iRecyclerModel = this.d.get(i);
        if (viewHolder instanceof IComponentLifeCycle2) {
            ((IComponentLifeCycle2) viewHolder).onPreloadView(iRecyclerModel);
        }
        viewHolder.itemView.setTag(R.id.tblive_tag_key_holder, viewHolder);
        viewHolder.itemView.setTag(R.id.tblive_tag_key_model, iRecyclerModel);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<IRecyclerModel> arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
        } else if (this.b) {
        } else {
            if ((this.h instanceof IComponentLifeCycle2) && (str2 = this.j) != null && str2.equals(((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId())) {
                ((IComponentLifeCycle2) this.h).onWillDisappear();
                this.h = null;
                this.j = null;
            }
            if (!(this.g instanceof IComponentLifeCycle2) || (str = this.i) == null || !str.equals(((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId())) {
                return;
            }
            ((IComponentLifeCycle2) this.g).onDidDisappear();
            RecyclerView.ViewHolder viewHolder2 = this.g;
            if (viewHolder2 instanceof IComponentLifeCycle2) {
                ((IComponentLifeCycle2) viewHolder2).onScrollStateChanged(0);
            }
            this.g = null;
            this.i = null;
        }
    }

    public void a(RecyclerView.ViewHolder viewHolder, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb19884f", new Object[]{this, viewHolder, new Boolean(z)});
        } else if ((z && System.currentTimeMillis() >= this.k && System.currentTimeMillis() <= this.k + 500) || !(viewHolder instanceof IComponentLifeCycle2)) {
        } else {
            String str2 = this.j;
            if (str2 != null && str2.equals(((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId())) {
                return;
            }
            RecyclerView.ViewHolder viewHolder2 = this.h;
            if ((viewHolder2 instanceof IComponentLifeCycle2) && ((str = this.i) == null || !str.equals(((IRecyclerModel) viewHolder2.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId()))) {
                ((IComponentLifeCycle2) this.h).onWillDisappear();
            }
            this.h = viewHolder;
            this.j = ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId();
            ((IComponentLifeCycle2) this.h).onWillAppear();
            this.k = System.currentTimeMillis();
        }
    }

    public void b(RecyclerView.ViewHolder viewHolder) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
        } else if (!(viewHolder instanceof OpenLiveSingleRoomVH) || (str = this.i) == null) {
        } else {
            if (str.equals(((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId()) && ((OpenLiveSingleRoomVH) this.g).isAboutToEndState()) {
                RecyclerView.ViewHolder viewHolder2 = this.g;
                if (!(viewHolder2 instanceof OpenLiveSingleRoomVH)) {
                    return;
                }
                ((OpenLiveSingleRoomVH) viewHolder2).interruptEndingState();
            } else if (this.i.equals(((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId()) || ((OpenLiveSingleRoomVH) this.g).isAboutToEndState()) {
            } else {
                RecyclerView.ViewHolder viewHolder3 = this.g;
                if (!(viewHolder3 instanceof OpenLiveSingleRoomVH)) {
                    return;
                }
                ((OpenLiveSingleRoomVH) viewHolder3).aboutToDisappear();
            }
        }
    }

    public void a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
        } else if (!(viewHolder instanceof IComponentLifeCycle2)) {
        } else {
            String str = this.i;
            if (str != null && str.equals(((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId())) {
                RecyclerView.ViewHolder viewHolder2 = this.h;
                if (!(viewHolder2 instanceof IComponentLifeCycle2)) {
                    return;
                }
                String str2 = this.i;
                if (str2 != null && str2.equals(((IRecyclerModel) viewHolder2.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId())) {
                    return;
                }
                ((IComponentLifeCycle2) this.h).onWillDisappear();
                this.h = null;
                this.j = null;
                return;
            }
            RecyclerView.ViewHolder viewHolder3 = this.g;
            if (viewHolder3 instanceof IComponentLifeCycle2) {
                ((IComponentLifeCycle2) viewHolder3).onDidDisappear();
            }
            this.g = viewHolder;
            this.i = ((IRecyclerModel) viewHolder.itemView.getTag(R.id.tblive_tag_key_model)).getViewItemId();
            a(this.g, false);
            ((IComponentLifeCycle2) this.g).onDidAppear();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa8f4d7", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.b = true;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c070a514", new Object[]{this, recyclerView});
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        for (int i = 0; i < getItemCount(); i++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition instanceof IComponentLifeCycle2) {
                ((IComponentLifeCycle2) findViewHolderForAdapterPosition).onDestroy();
            }
        }
        this.b = false;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.g;
        if (!(viewHolder instanceof IComponentLifeCycle2)) {
            return;
        }
        ((IComponentLifeCycle2) viewHolder).onScrollStateChanged(i);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.g;
        if (!(viewHolder instanceof IComponentLifeCycle2)) {
            return;
        }
        ((IComponentLifeCycle2) viewHolder).onStart();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.g;
        if (!(viewHolder instanceof IComponentLifeCycle2)) {
            return;
        }
        ((IComponentLifeCycle2) viewHolder).onPause();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.g;
        if (!(viewHolder instanceof IComponentLifeCycle2)) {
            return;
        }
        ((IComponentLifeCycle2) viewHolder).onResume();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.g;
        if (!(viewHolder instanceof IComponentLifeCycle2)) {
            return;
        }
        ((IComponentLifeCycle2) viewHolder).onStop();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.g;
        if (!(viewHolder instanceof p)) {
            return;
        }
        ((p) viewHolder).onStop(z);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        a(viewHolder, true);
    }

    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        RecyclerView.ViewHolder viewHolder = this.g;
        if (!(viewHolder instanceof j)) {
            return false;
        }
        return ((j) viewHolder).a(i, keyEvent);
    }

    private String a(Exception exc) {
        StringWriter stringWriter;
        PrintWriter printWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66410142", new Object[]{this, exc});
        }
        PrintWriter printWriter2 = null;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Throwable th) {
                th = th;
            }
            try {
                exc.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.flush();
                try {
                    stringWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                printWriter.close();
                return stringWriter.toString();
            } catch (Throwable th2) {
                th = th2;
                printWriter2 = printWriter;
                if (stringWriter != null) {
                    try {
                        stringWriter.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                if (printWriter2 != null) {
                    printWriter2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            stringWriter = null;
        }
    }
}
