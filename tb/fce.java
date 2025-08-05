package tb;

import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.android.detail.core.utils.c;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class fce extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ShippingNode.b> f27787a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        kge.a(-146503899);
    }

    public static /* synthetic */ Object ipc$super(fce fceVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fce(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        this.b = Color.parseColor("#CECECE");
        this.c = Color.parseColor("#7A45E5");
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.MultiStageViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject.containsKey(NWFullTracePlugin.FullTraceJSParam.STAGES)) {
            try {
                this.f27787a = epw.a(jSONObject.getJSONArray(NWFullTracePlugin.FullTraceJSParam.STAGES), new epy<ShippingNode.b>() { // from class: tb.fce.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode$b] */
                    @Override // tb.epy
                    public /* synthetic */ ShippingNode.b b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public ShippingNode.b a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (ShippingNode.b) ipChange.ipc$dispatch("1d9c789a", new Object[]{this, obj}) : new ShippingNode.b((JSONObject) obj);
                    }
                });
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.containsKey("normalColor")) {
            this.b = c.a(jSONObject.getString("normalColor"));
        }
        this.d = this.b;
        if (jSONObject.containsKey("titleNormalColor")) {
            this.d = c.a(jSONObject.getString("titleNormalColor"));
        }
        if (jSONObject.containsKey("selectedColor")) {
            this.c = c.a(jSONObject.getString("selectedColor"));
        }
        this.e = this.c;
        if (!jSONObject.containsKey("titleSelectedColor")) {
            return;
        }
        this.e = c.a(jSONObject.getString("titleSelectedColor"));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        ArrayList<ShippingNode.b> arrayList = this.f27787a;
        if (arrayList != null && arrayList.size() != 0) {
            return super.isValid();
        }
        return false;
    }

    public fce(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.b = Color.parseColor("#CECECE");
        this.c = Color.parseColor("#7A45E5");
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.MultiStageViewModel");
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields.containsKey(NWFullTracePlugin.FullTraceJSParam.STAGES)) {
            try {
                this.f27787a = epw.a(fields.getJSONArray(NWFullTracePlugin.FullTraceJSParam.STAGES), new epy<ShippingNode.b>() { // from class: tb.fce.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode$b] */
                    @Override // tb.epy
                    public /* synthetic */ ShippingNode.b b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public ShippingNode.b a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (ShippingNode.b) ipChange.ipc$dispatch("1d9c789a", new Object[]{this, obj}) : new ShippingNode.b((JSONObject) obj);
                    }
                });
            } catch (Throwable unused) {
            }
        }
        if (fields.containsKey("normalColor")) {
            this.b = c.a(fields.getString("normalColor"));
        }
        this.d = this.b;
        if (fields.containsKey("titleNormalColor")) {
            this.d = c.a(fields.getString("titleNormalColor"));
        }
        if (fields.containsKey("selectedColor")) {
            this.c = c.a(fields.getString("selectedColor"));
        }
        this.e = this.c;
        if (!fields.containsKey("titleSelectedColor")) {
            return;
        }
        this.e = c.a(fields.getString("titleSelectedColor"));
    }
}
