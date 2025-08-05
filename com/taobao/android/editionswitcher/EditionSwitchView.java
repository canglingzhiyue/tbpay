package com.taobao.android.editionswitcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import tb.kge;
import tb.kss;

/* loaded from: classes5.dex */
public class EditionSwitchView extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public h listener;
    public int remindKind;
    public int viewType;

    static {
        kge.a(-1352409004);
        kge.a(-1201612728);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        }
    }

    public EditionSwitchView(Context context, int i, h hVar) {
        super(context);
        this.viewType = 0;
        this.remindKind = 0;
        this.listener = hVar;
        setViewType(i);
    }

    public EditionSwitchView(Context context, AttributeSet attributeSet, int i, h hVar) {
        super(context, attributeSet);
        this.viewType = 0;
        this.remindKind = 0;
        this.listener = hVar;
        setViewType(i);
    }

    public EditionSwitchView(Context context, AttributeSet attributeSet, int i, int i2, h hVar) {
        super(context, attributeSet, i);
        this.viewType = 0;
        this.remindKind = 0;
        this.listener = hVar;
        setViewType(i2);
    }

    public void setViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486795fb", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= 2) {
        } else {
            this.viewType = i;
        }
    }

    public void traceShowEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d91a25f", new Object[]{this});
        } else if (this.viewType == 0) {
            String valueOf = String.valueOf(this.remindKind);
            commitEvent("Page_Home", 2201, "show-areaauto", valueOf, null, "area=" + l.c(getContext()).editionCode);
        } else {
            kss.a("Page_Home", 2201, "show-select", "area=" + l.c(getContext()).editionCode);
        }
    }

    public void traceConfirmEvent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c690de4", new Object[]{this, str, new Boolean(z)});
        } else if (this.viewType == 0) {
            String str2 = z ? "button-areaauto-confirm" : "button-areaautoyes";
            String valueOf = String.valueOf(this.remindKind);
            String valueOf2 = String.valueOf(z ? 1 : 0);
            commitEvent("Page_Home", 2101, str2, valueOf, valueOf2, "area=" + l.c(getContext()).editionCode + ",page_version=" + l.b(getContext()).editionCode + ",option=" + str);
        } else {
            kss.a("Page_Home", 2101, "button-selectyes", "area=" + l.c(getContext()).editionCode + ",page_version=" + l.b(getContext()).editionCode + ",option=" + str);
        }
    }

    public void traceCancelEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca428c2", new Object[]{this});
        } else if (this.viewType == 0) {
            String str = l.c(getContext()).editionCode;
            String valueOf = String.valueOf(this.remindKind);
            String str2 = l.a(str) ? "htao" : "";
            commitEvent("Page_Home", 2101, "button-areaautono", valueOf, str2, "area=" + str);
        } else {
            kss.a("Page_Home", 2101, "button-selectno", "area=" + l.c(getContext()).editionCode);
        }
    }

    public void processLocationChanged(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33c4a59", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        traceConfirmEvent(str, z);
        com.taobao.tao.topmultitab.c.a().c().a(context, str);
        h hVar = this.listener;
        if (hVar == null) {
            return;
        }
        hVar.a();
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
            com.taobao.android.behavix.h.a(str, str2 + "_BehaviX_UT", (String) null, (String) null, str5);
        } catch (Exception unused) {
        }
    }
}
