package com.taobao.android.detail.core.standard.widget.lightoff;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.dinamicx.ba;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends ba implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.detail.core.standard.widget.lightoff.model.a f9907a;
    private b b;
    private List<a> c;

    static {
        kge.a(584494903);
        kge.a(705005534);
    }

    public boolean a(com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ddfb5a", new Object[]{this, aVar})).booleanValue();
        }
        String a2 = i.a("LightOffPresenter", BTags.XLightOff);
        StringBuilder sb = new StringBuilder();
        sb.append("show:");
        sb.append(aVar != null ? aVar.toString() : "entryModel is null");
        com.taobao.android.detail.core.utils.i.a(a2, sb.toString());
        if (aVar == null || aVar.f9909a == null || TextUtils.isEmpty(aVar.b) || aVar.e == null || aVar.e.isEmpty()) {
            return false;
        }
        this.f9907a = aVar;
        b bVar = this.b;
        if (bVar != null && bVar.isShowing()) {
            return false;
        }
        this.b = new b(this.f9907a.f9909a, this.f9907a, this);
        this.b.show();
        return true;
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        b bVar = this.b;
        if (bVar == null || !bVar.isShowing()) {
            return false;
        }
        this.b.a(z);
        return true;
    }

    public Dialog a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("28547927", new Object[]{this}) : this.b;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594596f0", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.remove(aVar);
            this.c.add(aVar);
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void a(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d596fe", new Object[]{this, dialogInterface});
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            if (this.c.get(i) != null) {
                this.c.get(i).a(dialogInterface);
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void b(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2228339d", new Object[]{this, dialogInterface});
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            if (this.c.get(i) != null) {
                this.c.get(i).b(dialogInterface);
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void a(JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc1c04a", new Object[]{this, jSONObject, view});
            return;
        }
        com.taobao.android.detail.core.utils.i.a(i.a("LightOffPresenter", BTags.XLightOff), "onItemClick");
        for (int i = 0; i < this.c.size(); i++) {
            if (this.c.get(i) != null) {
                this.c.get(i).a(jSONObject, view);
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void b(JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f255c94b", new Object[]{this, jSONObject, view});
            return;
        }
        com.taobao.android.detail.core.utils.i.a(i.a("LightOffPresenter", BTags.XLightOff), "onLongClick");
        for (int i = 0; i < this.c.size(); i++) {
            if (this.c.get(i) != null) {
                this.c.get(i).b(jSONObject, view);
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        String a2 = i.a("LightOffPresenter", BTags.XLightOff);
        com.taobao.android.detail.core.utils.i.a(a2, "onPageSelected:" + jSONObject.toString());
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            if (this.c.get(i2) != null) {
                this.c.get(i2).a(jSONObject, i);
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            if (this.c.get(i2) != null) {
                this.c.get(i2).a(i);
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void a(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26181c1e", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            if (this.c.get(i3) != null) {
                this.c.get(i3).a(i, f, i2);
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
    public void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else if (objArr != null && objArr.length != 0) {
            String a2 = i.a("LightOffPresenter", BTags.XLightOff);
            com.taobao.android.detail.core.utils.i.a(a2, "onFloatClickEvent:" + objArr[0]);
            for (int i = 0; i < this.c.size(); i++) {
                if (this.c.get(i) != null) {
                    this.c.get(i).a(objArr);
                }
            }
        }
    }

    public void a(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710750b3", new Object[]{this, lightOffFloatModel});
        } else if (lightOffFloatModel == null) {
            com.taobao.android.detail.core.utils.i.a(i.a("LightOffPresenter", BTags.XLightOff), "updateBottomInfo params null");
        } else {
            String a2 = i.a("LightOffPresenter", BTags.XLightOff);
            com.taobao.android.detail.core.utils.i.a(a2, "updateBottomInfo params:" + lightOffFloatModel.toString());
            this.b.a(lightOffFloatModel);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }
}
