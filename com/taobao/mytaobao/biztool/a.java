package com.taobao.mytaobao.biztool;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J \u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0002J\u000e\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010(\u001a\u00020 J\u0006\u0010)\u001a\u00020 J\u0016\u0010*\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/taobao/mytaobao/biztool/MtbToolEditPresenter;", "", "()V", "PAGE_NAME", "", "getPAGE_NAME", "()Ljava/lang/String;", "canNotRemoveCount", "", "getCanNotRemoveCount", "()I", "setCanNotRemoveCount", "(I)V", "hasChanged", "", "getHasChanged", "()Z", "setHasChanged", "(Z)V", "listMarket", "Lcom/alibaba/fastjson/JSONArray;", "getListMarket", "()Lcom/alibaba/fastjson/JSONArray;", "listMyTool", "getListMyTool", "mIView", "Lcom/taobao/mytaobao/biztool/MtbToolEditActivity;", "getMIView", "()Lcom/taobao/mytaobao/biztool/MtbToolEditActivity;", "setMIView", "(Lcom/taobao/mytaobao/biztool/MtbToolEditActivity;)V", "commitAddClickUT", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "commitDragUT", "dragData", "fromIndex", "toIndex", "commitRemoveClickUT", "considerSaveData", "fetchPageData", "requestItemMove", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtbToolEditActivity b;
    private int e;
    private boolean f;

    /* renamed from: a  reason: collision with root package name */
    private final String f18363a = "Page_MyTB_itool";
    private final JSONArray c = new JSONArray();
    private final JSONArray d = new JSONArray();

    static {
        kge.a(1715140337);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f18363a;
    }

    public final void a(MtbToolEditActivity mtbToolEditActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c17af3", new Object[]{this, mtbToolEditActivity});
        } else {
            this.b = mtbToolEditActivity;
        }
    }

    public final MtbToolEditActivity b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtbToolEditActivity) ipChange.ipc$dispatch("1586cd34", new Object[]{this}) : this.b;
    }

    public final JSONArray c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c49d9194", new Object[]{this}) : this.c;
    }

    public final JSONArray d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("38dcc9f3", new Object[]{this}) : this.d;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.statistic.page");
        mtopRequest.setVersion("1.0");
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.mo1305reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.biztool.MtbToolEditPresenter$fetchPageData$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                int i2 = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                q.c(mtopResponse, "mtopResponse");
                try {
                    byte[] bytedata = mtopResponse.getBytedata();
                    q.a((Object) bytedata, "mtopResponse.bytedata");
                    JSONObject parseObject = JSONObject.parseObject(new String(bytedata, d.UTF_8));
                    JSONArray userCustom = parseObject.getJSONObject("data").getJSONArray("userCustom");
                    a.this.c().clear();
                    a.this.a(0);
                    q.a((Object) userCustom, "userCustom");
                    int i3 = 0;
                    for (Object obj2 : userCustom) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p.b();
                        }
                        if (obj2 != null) {
                            JSONObject jSONObject = (JSONObject) obj2;
                            if (q.a((Object) jSONObject.getString("canRemove"), (Object) "false")) {
                                a aVar = a.this;
                                aVar.a(aVar.e() + 1);
                            }
                            jSONObject.put("mtbUniId", (Object) Integer.valueOf(i3));
                            i3 = i4;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                    a.this.c().addAll(userCustom);
                    JSONArray all = parseObject.getJSONObject("data").getJSONArray("all");
                    q.a((Object) all, "all");
                    int i5 = 0;
                    for (Object obj3 : all) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            p.b();
                        }
                        if (obj3 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                        ((JSONObject) obj3).put("mtbUniId", (Object) Integer.valueOf(i5 + 100));
                        i5 = i6;
                    }
                    a.this.d().clear();
                    for (Object obj4 : all) {
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            p.b();
                        }
                        if (obj4 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                        ((JSONObject) obj4).put("mtbUniId", (Object) Integer.valueOf(i2));
                        i2 = i7;
                    }
                    a.this.d().addAll(all);
                    MtbToolEditActivity b = a.this.b();
                    if (b == null) {
                        return;
                    }
                    b.a(a.this.c(), a.this.d());
                } catch (Throwable unused) {
                    MtbToolEditActivity b2 = a.this.b();
                    if (b2 == null) {
                        return;
                    }
                    b2.a();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                MtbToolEditActivity b = a.this.b();
                if (b == null) {
                    return;
                }
                b.a();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                MtbToolEditActivity b = a.this.b();
                if (b == null) {
                    return;
                }
                b.a();
            }
        });
        build.startRequest();
    }

    public final boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.e;
        if (i < i3 || i2 < i3) {
            return false;
        }
        JSONObject dragData = this.c.getJSONObject(i);
        if (i < i2) {
            int i4 = i;
            while (i4 < i2) {
                int i5 = i4 + 1;
                Collections.swap(this.c, i4, i5);
                i4 = i5;
            }
        } else {
            int i6 = i2 + 1;
            if (i >= i6) {
                int i7 = i;
                while (true) {
                    Collections.swap(this.c, i7, i7 - 1);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        this.f = true;
        q.a((Object) dragData, "dragData");
        a(dragData, i, i2);
        return true;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f) {
            this.f = false;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.taobao.mclaren.statistic.page.save");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Object obj : this.c) {
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                jSONArray.add(((JSONObject) obj).getString("bizCode"));
            }
            jSONObject.put("bizList", (Object) jSONArray.toJSONString());
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
            build.mo1328setUnitStrategy("UNIT_TRADE");
            build.mo1305reqMethod(MethodEnum.POST);
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.biztool.MtbToolEditPresenter$considerSaveData$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj2});
                    } else {
                        q.c(mtopResponse, "mtopResponse");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    }
                }
            });
            build.startRequest();
        }
    }

    public final void a(JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, data});
            return;
        }
        q.c(data, "data");
        String str = this.f18363a;
        TBS.Ext.commitEvent(str, 2101, "/mytaobao.itool.add", null, null, "bizCode=" + data.getString("bizCode"));
    }

    public final void b(JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, data});
            return;
        }
        q.c(data, "data");
        String str = this.f18363a;
        TBS.Ext.commitEvent(str, 2101, "/mytaobao.itool.delete", null, null, "bizCode=" + data.getString("bizCode"));
    }

    private final void a(JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a499e8", new Object[]{this, jSONObject, new Integer(i), new Integer(i2)});
            return;
        }
        String str = this.f18363a;
        TBS.Ext.commitEvent(str, 2101, "/mytaobao.itool.drag", null, null, "bizCode=" + jSONObject.getString("bizCode"), "fromIndex=" + i, "toIndex=" + i2);
    }
}
