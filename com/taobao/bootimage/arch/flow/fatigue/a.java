package com.taobao.bootimage.arch.flow.fatigue;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tb.kej;
import tb.kge;
import tb.srf;
import tb.srl;
import tb.srm;
import tb.ssg;

/* loaded from: classes6.dex */
public class a implements srf, srl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RemoteFatigueDataModel f16661a;
    private LocalRecordModel b;

    static {
        kge.a(2066799261);
        kge.a(-720414177);
        kge.a(1012900376);
    }

    @Override // tb.srl
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        }
    }

    public static /* synthetic */ LocalRecordModel a(a aVar, LocalRecordModel localRecordModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalRecordModel) ipChange.ipc$dispatch("c9d3c327", new Object[]{aVar, localRecordModel});
        }
        aVar.b = localRecordModel;
        return localRecordModel;
    }

    public static /* synthetic */ RemoteFatigueDataModel a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteFatigueDataModel) ipChange.ipc$dispatch("f7246bc9", new Object[]{aVar}) : aVar.f16661a;
    }

    public static /* synthetic */ RemoteFatigueDataModel a(a aVar, RemoteFatigueDataModel remoteFatigueDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteFatigueDataModel) ipChange.ipc$dispatch("7dbe73c5", new Object[]{aVar, remoteFatigueDataModel});
        }
        aVar.f16661a = remoteFatigueDataModel;
        return remoteFatigueDataModel;
    }

    public static /* synthetic */ LocalRecordModel b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalRecordModel) ipChange.ipc$dispatch("e15663fb", new Object[]{aVar}) : aVar.b;
    }

    @Override // tb.srl
    public void bN_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8cecba", new Object[]{this});
            return;
        }
        ssg.a().a("remoteGlobalFrequency", new srm() { // from class: com.taobao.bootimage.arch.flow.fatigue.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.srm
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    try {
                        a.a(a.this, (RemoteFatigueDataModel) JSON.parseObject(str, RemoteFatigueDataModel.class));
                        kej.a("2ARCH_FatigueWorkFlow", "loadFinish: " + a.a(a.this).toString());
                    } catch (Exception e) {
                        kej.a("2ARCH_FatigueWorkFlow", "loadDataFromCache error ", e);
                    }
                }
            }
        });
        ssg.a().a("localGlobalFrequency", new srm() { // from class: com.taobao.bootimage.arch.flow.fatigue.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.srm
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    try {
                        a.a(a.this, (LocalRecordModel) JSON.parseObject(str, LocalRecordModel.class));
                        kej.a("2ARCH_FatigueWorkFlow", "loadFinish: " + a.b(a.this).toString());
                    } catch (Exception e) {
                        kej.a("2ARCH_FatigueWorkFlow", "loadDataFromCache error ", e);
                    }
                }
            }
        });
    }

    @Override // tb.srl
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            kej.a("2ARCH_FatigueWorkFlow", "upDateGlobalFrequency ext null");
            return;
        }
        try {
            this.f16661a = (RemoteFatigueDataModel) JSON.parseObject(jSONObject2.toJSONString(), RemoteFatigueDataModel.class);
            kej.a("2ARCH_FatigueWorkFlow", "updateAwesomeData: " + this.f16661a);
            ssg.a().a("remoteGlobalFrequency", jSONObject2.toJSONString());
        } catch (Exception e) {
            kej.a("2ARCH_FatigueWorkFlow", "updateAwesomeData error ", e);
        }
    }

    @Override // tb.srf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !c();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.f16661a != null && this.b != null) {
            return d() || e();
        }
        kej.a("2ARCH_FatigueWorkFlow", "isInGlobalFatigue: mFatigueDataModel null");
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = new LocalRecordModel();
        }
        this.b.localLastShowDay = f();
        this.b.localLastShowTime = String.valueOf(System.currentTimeMillis());
        this.b.localLastShowDayCount++;
        kej.a("2ARCH_FatigueWorkFlow", "updateLocalFatigue: " + JSON.toJSONString(this.b));
        ssg.a().a("localGlobalFrequency", JSON.toJSONString(this.b));
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        String f = f();
        kej.a("2ARCH_FatigueWorkFlow", "isInLimitInSingleDay currentDay: " + f);
        if (!TextUtils.equals(f, this.b.localLastShowDay)) {
            kej.a("2ARCH_FatigueWorkFlow", "isInLimitInSingleDay diff lastShowDayValue : " + this.b.localLastShowDay);
            return false;
        }
        kej.a("2ARCH_FatigueWorkFlow", "isInLimitInSingleDay lastShowDayCountValue : " + this.b.localLastShowDayCount + ",limitInSingleDayValue: " + this.f16661a.globalLimitInSingleDay);
        return ((long) this.b.localLastShowDayCount) > Long.parseLong(this.f16661a.globalLimitInSingleDay);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.b.localLastShowTime) || TextUtils.isEmpty(this.f16661a.globalLimitSeconds)) {
            return false;
        }
        long parseLong = (currentTimeMillis - Long.parseLong(this.b.localLastShowTime)) / 1000;
        kej.a("2ARCH_FatigueWorkFlow", "isInHourLimit: diffTime = " + parseLong + ",limitSecondsValue:" + this.b.localLastShowTime);
        return parseLong <= Long.parseLong(this.f16661a.globalLimitSeconds);
    }

    private String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }
}
