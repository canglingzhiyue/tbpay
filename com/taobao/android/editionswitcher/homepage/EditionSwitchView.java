package com.taobao.android.editionswitcher.homepage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.statistic.TBS;
import tb.kge;

/* loaded from: classes5.dex */
public class EditionSwitchView extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PAGE_HOME = "Page_Home";
    public d mListener;
    public int mViewType;
    public int remindKind;

    static {
        kge.a(-398674727);
        kge.a(-1201612728);
    }

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

    public EditionSwitchView(Context context, int i, d dVar) {
        super(context);
        this.mViewType = 0;
        this.remindKind = 0;
        this.mListener = dVar;
        setViewType(i);
    }

    public void setViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486795fb", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= 2) {
        } else {
            this.mViewType = i;
        }
    }

    public void traceShowEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d91a25f", new Object[]{this});
        } else if (this.mViewType == 0) {
            String str = this.remindKind == 0 ? "0" : "1";
            commitEvent("Page_Home", 2201, "htao_show-areaauto", str, null, "area=" + com.taobao.android.editionswitcher.b.c() + ",page_version=" + com.taobao.android.editionswitcher.b.b(getContext()).editionCode + ",option=" + com.taobao.android.editionswitcher.b.c(getContext()).editionCode);
        } else {
            commitEvent("Page_Home", 2201, "htao_show-select", "area=" + com.taobao.android.editionswitcher.b.c() + ",page_version=" + com.taobao.android.editionswitcher.b.b(getContext()).editionCode + ",option=" + com.taobao.android.editionswitcher.b.c(getContext()).editionCode);
        }
    }

    public void traceConfirmEvent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c690de4", new Object[]{this, str, new Boolean(z)});
        } else if (this.mViewType == 0) {
            String str2 = this.remindKind == 0 ? "0" : "1";
            String valueOf = String.valueOf(z ? 1 : 0);
            commitEvent("Page_Home", 2101, "htao_button-areaautoyes", str2, valueOf, "area=" + com.taobao.android.editionswitcher.b.c() + ",page_version=" + com.taobao.android.editionswitcher.b.b(getContext()).editionCode + ",option=" + str);
        } else {
            commitEvent("Page_Home", 2101, "htao_button-selectyes", "area=" + com.taobao.android.editionswitcher.b.c() + ",page_version=" + com.taobao.android.editionswitcher.b.b(getContext()).editionCode + ",option=" + str);
        }
    }

    public void traceCancelEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca428c2", new Object[]{this});
            return;
        }
        String c = com.taobao.android.editionswitcher.b.c();
        if (this.mViewType == 0) {
            String str = this.remindKind == 0 ? "0" : "1";
            commitEvent("Page_Home", 2101, "htao_button-areaautono", str, "", "area=" + c);
            return;
        }
        commitEvent("Page_Home", 2101, "htao_button-selectno", "area=" + c);
    }

    public void processLocationChanged(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33c4a59", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        traceConfirmEvent(str, z);
        com.taobao.android.editionswitcher.b.b(context, str);
        d dVar = this.mListener;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    public static void commitEvent(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb757923", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, str3);
            h.a(str, str2 + "_BehaviX_UT", (String) null, (String) null, str3);
        } catch (Exception unused) {
        }
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
            h.a(str, str2 + "_BehaviX_UT", (String) null, (String) null, str5);
        } catch (Exception unused) {
        }
    }
}
