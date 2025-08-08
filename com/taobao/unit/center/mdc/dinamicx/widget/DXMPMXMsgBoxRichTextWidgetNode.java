package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.kge;

/* loaded from: classes9.dex */
public class DXMPMXMsgBoxRichTextWidgetNode extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMPMXMSGBOXRICHTEXT_COLORRULES = -224133431040551116L;
    public static final long DXMPMXMSGBOXRICHTEXT_MPMXMSGBOXRICHTEXT = 1514903933273583823L;
    public static final long DXMPMXMSGBOXRICHTEXT_SYSTEMTEXTSIZE = 3582162173992669683L;
    private static final LruCache<String, Boolean> sCacheMap;
    private JSONArray colorRules;
    private int systemTextSize;

    public static /* synthetic */ Object ipc$super(DXMPMXMsgBoxRichTextWidgetNode dXMPMXMsgBoxRichTextWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(499440485);
        sCacheMap = new LruCache<>(100);
    }

    /* loaded from: classes9.dex */
    public static class Builder implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(811629884);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMPMXMsgBoxRichTextWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMPMXMsgBoxRichTextWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXMPMXMsgBoxRichTextWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXMPMXMsgBoxRichTextWidgetNode dXMPMXMsgBoxRichTextWidgetNode = (DXMPMXMsgBoxRichTextWidgetNode) dXWidgetNode;
            this.colorRules = dXMPMXMsgBoxRichTextWidgetNode.colorRules;
            this.systemTextSize = dXMPMXMsgBoxRichTextWidgetNode.systemTextSize;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null || !(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        String charSequence = getText() == null ? null : getText().toString();
        if (charSequence == null) {
            return;
        }
        Boolean bool = sCacheMap.get(charSequence);
        if (bool != null && !bool.booleanValue()) {
            return;
        }
        String convertExpression = ExpressionTable.convertExpression(charSequence);
        if (!StringUtils.isEmpty(convertExpression)) {
            textView.setText(convertExpression);
        } else {
            textView.setText("");
        }
        LruCache<String, Boolean> lruCache = sCacheMap;
        if (charSequence != convertExpression) {
            z = false;
        }
        lruCache.put(charSequence, Boolean.valueOf(z));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXMPMXMSGBOXRICHTEXT_COLORRULES) {
            this.colorRules = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
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
