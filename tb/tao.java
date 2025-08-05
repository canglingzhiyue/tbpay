package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class tao extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXDETAILADAPTIVELINEARLAYOUT_ENABLECOMPLEMENT = 8723894412244725131L;
    public static final long DX_EVENT_ID;
    public static final long VIEW_IDENTITY;

    /* renamed from: a  reason: collision with root package name */
    private int f33990a = 1;

    public static /* synthetic */ Object ipc$super(tao taoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 112799177:
                super.measureHorizontal(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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

    static {
        kge.a(-456841526);
        long a2 = fxa.a("DetailAdaptiveLinearLayout");
        DX_EVENT_ID = a2;
        VIEW_IDENTITY = a2;
    }

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2098883679);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new tao();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.d, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new tao();
    }

    @Override // com.taobao.android.dinamicx.widget.d, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof tao)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.f33990a = ((tao) dXWidgetNode).f33990a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.d, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 8723894412244725131L) {
            this.f33990a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.d, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != 8723894412244725131L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1;
    }

    @Override // com.taobao.android.dinamicx.widget.d, com.taobao.android.dinamicx.widget.o
    public void measureHorizontal(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b92dc9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.measureHorizontal(i, i2);
        if (this.f33990a != 1) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        ArrayList arrayList = new ArrayList();
        for (DXWidgetNode dXWidgetNode : getChildren()) {
            int measuredWidth = dXWidgetNode.getMeasuredWidth() + paddingLeft;
            if (measuredWidth > getMeasuredWidth()) {
                dXWidgetNode.setVisibility(2);
                arrayList.add(false);
            } else {
                dXWidgetNode.setVisibility(0);
                arrayList.add(true);
                paddingLeft = measuredWidth;
            }
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        a(dXRuntimeContext.m(), arrayList, dXRuntimeContext.e());
    }

    private void a(Context context, List<Boolean> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bae37bf", new Object[]{this, context, list, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events").getJSONArray(AURAEventKey.exposureItem).getJSONObject(0).getJSONObject("fields").getJSONObject("args");
            jSONObject2.put("itemFeature", (Object) a(jSONObject2.getString("itemFeature"), list));
            jSONObject2.put("itemFeatureSize", (Object) String.valueOf(list.size()));
            jSONObject2.put("itemFeatureBizType", (Object) a(jSONObject2.getString("itemFeatureBizType"), list));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("page", (Object) "Page_Detail");
            jSONObject3.put("eventId", (Object) 2201);
            jSONObject3.put("arg1", (Object) "Page_Detail_Show-ItemFeature-Adjusted");
            jSONObject3.put("args", (Object) jSONObject2);
            c.a(context, new h("userTrack", jSONObject3, new RuntimeAbilityParam[0]));
        } catch (Throwable th) {
            i.a("DXDetailAdaptiveLinearLayoutWidgetNode", "exposureItem 商品背书额外曝光", th);
        }
    }

    private String a(String str, List<Boolean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e49249dd", new Object[]{this, str, list});
        }
        StringBuffer stringBuffer = new StringBuffer();
        String[] split = str.split(";");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).booleanValue()) {
                if (!TextUtils.isEmpty(stringBuffer)) {
                    stringBuffer.append(";");
                }
                stringBuffer.append(split[i]);
            }
        }
        return stringBuffer.toString();
    }
}
