package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.HashMap;
import tb.kge;
import tb.ldf;
import tb.ldz;
import tb.lea;
import tb.leb;
import tb.lfq;
import tb.ljb;
import tb.ljc;
import tb.ljs;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Integer> f17366a = new HashMap<>(64);
    private final HashMap<Integer, ldz> b = new HashMap<>(64);
    private int c;
    private final ljs d;
    private final DinamicXEngine e;

    static {
        kge.a(78798360);
    }

    public b(ljs ljsVar, DinamicXEngine dinamicXEngine) {
        this.d = ljsVar;
        this.e = dinamicXEngine;
    }

    public int a(BaseSectionModel baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22760333", new Object[]{this, baseSectionModel, jSONObject})).intValue() : b(baseSectionModel, jSONObject);
    }

    public int a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{this, jSONObject})).intValue() : b(null, jSONObject);
    }

    private int b(BaseSectionModel baseSectionModel, JSONObject jSONObject) {
        Integer num;
        Integer num2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fe2c052", new Object[]{this, baseSectionModel, jSONObject})).intValue();
        }
        if (jSONObject == null) {
            return -1;
        }
        ldz a2 = leb.a(jSONObject);
        String b = a2.b();
        String c = a2.c();
        if (StringUtils.isEmpty(b) || StringUtils.isEmpty(c)) {
            num = -1;
            a(a2);
        } else {
            String a3 = a(b, c, baseSectionModel);
            if (a2.h()) {
                this.f17366a.remove(a3);
                a2.a(false);
            }
            num = this.f17366a.get(a3);
            if (num == null) {
                if (a2.a()) {
                    DXTemplateItem a4 = this.e.a(a2.f());
                    if (a4 == null) {
                        num = -1;
                    } else {
                        if (!StringUtils.equals(a4.f11925a, b) || !StringUtils.equals(String.valueOf(a4.b), c)) {
                            String str = a4.f11925a;
                            a3 = a(str, a4.b + "", baseSectionModel);
                        }
                        num2 = this.f17366a.get(a3);
                        if (num2 == null) {
                            int i = this.c;
                            this.c = i + 1;
                            num2 = Integer.valueOf(i);
                            this.f17366a.put(a3, num2);
                            this.b.put(num2, a2);
                        }
                        num = num2;
                    }
                } else {
                    DinamicTemplate d = DTemplateManager.a(lfq.DINAMIC_MODULE).d(a2.e());
                    if (d == null) {
                        num = -1;
                        ldf.d("InfoFlowViewTypeGenerator", "exactTemplate is null");
                    } else {
                        if (!StringUtils.equals(d.name, b) || !StringUtils.equals(d.version, c)) {
                            String str2 = d.name;
                            a3 = a(str2, d.version + "", baseSectionModel);
                        }
                        num2 = this.f17366a.get(a3);
                        if (num2 == null) {
                            int i2 = this.c;
                            this.c = i2 + 1;
                            num2 = Integer.valueOf(i2);
                            this.f17366a.put(a3, num2);
                            this.b.put(num2, a2);
                        }
                        num = num2;
                    }
                }
            } else {
                this.b.put(num, a2);
            }
        }
        return num.intValue();
    }

    private String a(String str, String str2, BaseSectionModel baseSectionModel) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2501105c", new Object[]{this, str, str2, baseSectionModel});
        }
        int a2 = lea.a((JSONObject) baseSectionModel);
        if (a2 == -1) {
            str3 = str + "_" + str2;
        } else {
            str3 = str + "_" + str2 + "_" + a2;
        }
        ldf.d("InfoFlowViewTypeGenerator", "getTemplateKey : " + str3);
        return str3;
    }

    public ldz a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ldz) ipChange.ipc$dispatch("e6642cc9", new Object[]{this, new Integer(i)}) : this.b.get(Integer.valueOf(i));
    }

    private void a(ldz ldzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f299f596", new Object[]{this, ldzVar});
        } else if (ldzVar == null) {
        } else {
            String a2 = this.d.a().a();
            String b = ldzVar.b();
            String c = ldzVar.c();
            String d = ldzVar.d();
            ljc.a(new ljb(a2, "dx3Render", 3002, "dx3 renderTemplate error", "name=" + b + ", version=" + c + ", url=" + d));
        }
    }
}
