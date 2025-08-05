package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.i;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.kge;

/* loaded from: classes9.dex */
public class DXMPMXMsgBoxFastTextWidgetNode extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMPMXMSGBOXFASTTEXT_MPMXMSGBOXFASTTEXT = 7935141591959809239L;
    public static final long DXMPMXMSGBOXFASTTEXT_SYSTEMTEXTSIZE = 3582162173992669683L;
    private int systemTextSize;

    static {
        kge.a(-1324995867);
    }

    public static /* synthetic */ Object ipc$super(DXMPMXMsgBoxFastTextWidgetNode dXMPMXMsgBoxFastTextWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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

    /* loaded from: classes9.dex */
    public static class Builder implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(857361596);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMPMXMsgBoxFastTextWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMPMXMsgBoxFastTextWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXMPMXMsgBoxFastTextWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.systemTextSize = ((DXMPMXMsgBoxFastTextWidgetNode) dXWidgetNode).systemTextSize;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 3582162173992669683L) {
            this.systemTextSize = i;
        } else if (6751005219504497256L != j) {
            super.onSetIntAttribute(j, i);
        } else if (i > 0) {
            Context m = getDXRuntimeContext().m();
            setTextSize(DisplayUtil.sp2px(m, DisplayUtil.px2dip(m, i)));
        } else {
            setTextSize(DEFAULT_TEXT_SIZE);
        }
    }
}
