package tb;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.taobao.TBActionBar;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.i;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;

/* loaded from: classes6.dex */
public class hwf extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXNAVIBARMOREVIEW_BADGECOLOR = 2373749041343598844L;
    public static final long DXNAVIBARMOREVIEW_MOREICONCOLOR = -4697674858662531768L;
    public static final long DXNAVIBARMOREVIEW_NAVIBARMOREVIEW = -7527731942041097248L;
    public static final long DXNAVIBARMOREVIEW_TEXTCOLOR = 5737767606580872653L;

    /* renamed from: a  reason: collision with root package name */
    private int f28827a = -1;
    private int b = -1;
    private int c = -45056;

    static {
        kge.a(-484233284);
    }

    public static /* synthetic */ Object ipc$super(hwf hwfVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof hwf)) {
        } else {
            super.onClone(dXWidgetNode, z);
            hwf hwfVar = (hwf) dXWidgetNode;
            this.f28827a = hwfVar.f28827a;
            this.b = hwfVar.b;
            this.c = hwfVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXNAVIBARMOREVIEW_BADGECOLOR) {
            this.f28827a = i;
        } else if (j == DXNAVIBARMOREVIEW_MOREICONCOLOR) {
            this.b = i;
        } else if (j == 5737767606580872653L) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new hwf();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new TBActionView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (context == null) {
            return;
        }
        hyn.a("DXNaviBarMoreViewWidget", "onRenderView", "----");
        TBActionView tBActionView = (TBActionView) view;
        if (context instanceof ITBPublicMenu) {
            ITBPublicMenu iTBPublicMenu = (ITBPublicMenu) context;
            if (iTBPublicMenu.getPublicMenu() != null) {
                iTBPublicMenu.getPublicMenu().setCustomOverflow(tBActionView);
            }
        } else if (context instanceof FragmentActivity) {
            ISupportFragment a2 = i.a(((FragmentActivity) context).getSupportFragmentManager());
            if (a2 instanceof ITBPublicMenu) {
                ITBPublicMenu iTBPublicMenu2 = (ITBPublicMenu) a2;
                if (iTBPublicMenu2.getPublicMenu() != null) {
                    iTBPublicMenu2.getPublicMenu().setCustomOverflow(tBActionView);
                }
            }
        }
        tBActionView.setTitle(context.getString(R.string.actionBar_uikit_title));
        String a3 = FestivalMgr.a().a("global", nom.KEY_NAVI_STYLE);
        if (TextUtils.isEmpty(a3)) {
            tBActionView.setIconColor(this.b);
            tBActionView.setMessageNumColor(this.c);
            tBActionView.setMessageBackgroundColor(this.f28827a);
            return;
        }
        boolean equals = TextUtils.equals("1", a3);
        hyn.a("DXNaviBarMoreViewWidget", "onRenderView", "isDark = " + equals);
        if (equals) {
            tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
        } else {
            tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.DARK);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a4 = DXWidgetNode.DXMeasureSpec.a(i);
        int a5 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a4 == 1073741824;
        if (a5 != 1073741824) {
            z = false;
        }
        if (z2 && z) {
            super.onMeasure(i, i2);
            return;
        }
        if (z2) {
            a3 = DXWidgetNode.DXMeasureSpec.b(i);
            a2 = gbg.a(DinamicXEngine.i(), 48.0f);
        } else if (z) {
            a2 = DXWidgetNode.DXMeasureSpec.b(i2);
            a3 = gbg.a(DinamicXEngine.i(), 48.0f);
        } else {
            a2 = gbg.a(DinamicXEngine.i(), 48.0f);
            a3 = gbg.a(DinamicXEngine.i(), 48.0f);
        }
        setMeasuredDimension(resolveSize(a3, i), resolveSize(a2, i2));
    }
}
