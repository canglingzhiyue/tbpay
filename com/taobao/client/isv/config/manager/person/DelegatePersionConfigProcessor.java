package com.taobao.client.isv.config.manager.person;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.taobao.util.g;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.client.isv.config.manager.a;
import com.taobao.orange.util.c;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.mto;
import tb.ndp;
import tb.ndw;
import tb.nea;

/* loaded from: classes7.dex */
public class DelegatePersionConfigProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQ_TYPE_QUERY_LBS_SWITCH = 1;

    /* renamed from: a  reason: collision with root package name */
    private a f16912a;
    private int b;
    private Context c;
    private Application d;
    private IRemoteBaseListener e;
    private Map<String, Map<String, String>> f;

    /* renamed from: com.taobao.client.isv.config.manager.person.DelegatePersionConfigProcessor$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 extends AsyncTask<Void, Void, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DelegatePersionConfigProcessor f16913a;

        public Object a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5307165e", new Object[]{this, voidArr});
            }
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException unused) {
            }
            this.f16913a.a();
            return null;
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ Object doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }
    }

    static {
        kge.a(-637634654);
        kge.a(-279988908);
    }

    public static /* synthetic */ int a(DelegatePersionConfigProcessor delegatePersionConfigProcessor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16237fe1", new Object[]{delegatePersionConfigProcessor, new Integer(i)})).intValue();
        }
        delegatePersionConfigProcessor.b = i;
        return i;
    }

    public static /* synthetic */ void a(DelegatePersionConfigProcessor delegatePersionConfigProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2229b5", new Object[]{delegatePersionConfigProcessor});
        } else {
            delegatePersionConfigProcessor.b();
        }
    }

    public static /* synthetic */ void a(DelegatePersionConfigProcessor delegatePersionConfigProcessor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9a7130", new Object[]{delegatePersionConfigProcessor, map});
        } else {
            delegatePersionConfigProcessor.c(map);
        }
    }

    public static /* synthetic */ void b(DelegatePersionConfigProcessor delegatePersionConfigProcessor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1c390f", new Object[]{delegatePersionConfigProcessor, map});
        } else {
            delegatePersionConfigProcessor.b(map);
        }
    }

    public static /* synthetic */ void c(DelegatePersionConfigProcessor delegatePersionConfigProcessor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9e00ee", new Object[]{delegatePersionConfigProcessor, map});
        } else {
            delegatePersionConfigProcessor.a(map);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b == 1) {
        } else {
            LBSDTO a2 = ndp.a();
            nea.d("lbs_config_log_DelegatePersionConfigProcessor", "cached lbsdto: " + a2);
            String str = null;
            Location a3 = a2 == null ? new ndp(ndw.f31376a).a(100, 60000L) : null;
            if (!g.a(this.c)) {
                this.b = 2;
            } else if (a2 != null) {
                String jSONString = a2.getCells() != null ? JSON.toJSONString(a2.getCells()) : null;
                if (a2.getWifis() != null) {
                    str = JSON.toJSONString(a2.getWifis());
                }
                a(a2.getLongitude(), a2.getLatitude(), jSONString, str, a2.getCellMCC(), a2.getCellMNC());
                this.b = 1;
            } else {
                a(Double.valueOf(a3 == null ? Double.valueOf((double) mto.a.GEO_NOT_SUPPORT).doubleValue() : a3.getLongitude()), Double.valueOf(a3 == null ? Double.valueOf((double) mto.a.GEO_NOT_SUPPORT).doubleValue() : a3.getLatitude()), "", "", (short) 0, (short) 0);
                this.b = 1;
            }
        }
    }

    public void a(Double d, Double d2, String str, String str2, Short sh, Short sh2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3d4230", new Object[]{this, d, d2, str, str2, sh, sh2});
            return;
        }
        MtopLbsConfigRequest mtopLbsConfigRequest = new MtopLbsConfigRequest();
        if (str != null) {
            mtopLbsConfigRequest.setCellInfo(str);
        }
        if (d2 != null) {
            mtopLbsConfigRequest.setLatitude(d2.doubleValue());
        }
        if (d != null) {
            mtopLbsConfigRequest.setLongitude(d.doubleValue());
        }
        if (str2 != null) {
            mtopLbsConfigRequest.setWifiInfos(str2);
        }
        if (sh != null) {
            mtopLbsConfigRequest.setMcc(sh.shortValue());
        }
        if (sh2 != null) {
            mtopLbsConfigRequest.setMnc(sh2.shortValue());
        }
        RemoteBusiness.build(this.d, mtopLbsConfigRequest, TaoApplication.getTTID()).registeListener((IRemoteListener) this.e).mo1342showLoginUI(false).mo1340setBizId(75).startRequest(1, MtopLbsConfigResponse.class);
    }

    /* loaded from: classes7.dex */
    public class UpdateConfigRequestListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-790543018);
            kge.a(-525336021);
        }

        private UpdateConfigRequestListener() {
        }

        public /* synthetic */ UpdateConfigRequestListener(DelegatePersionConfigProcessor delegatePersionConfigProcessor, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                DelegatePersionConfigProcessor.a(DelegatePersionConfigProcessor.this, 3);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (baseOutDo != null) {
                try {
                    Map map = (Map) baseOutDo.mo2429getData();
                    if (map != null) {
                        nea.c("lbs_config_log_DelegatePersionConfigProcessor", "[onSuccess] get persion config data=" + map.toString());
                        DelegatePersionConfigProcessor.a(DelegatePersionConfigProcessor.this);
                        DelegatePersionConfigProcessor.a(DelegatePersionConfigProcessor.this, map);
                        DelegatePersionConfigProcessor.b(DelegatePersionConfigProcessor.this, map);
                        DelegatePersionConfigProcessor.c(DelegatePersionConfigProcessor.this, map);
                    } else {
                        nea.d("lbs_config_log_DelegatePersionConfigProcessor", "[onSuccess] get persion config data null");
                    }
                    DelegatePersionConfigProcessor.a(DelegatePersionConfigProcessor.this, 3);
                } catch (Exception unused) {
                }
            } else {
                DelegatePersionConfigProcessor.a(DelegatePersionConfigProcessor.this, 3);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                DelegatePersionConfigProcessor.a(DelegatePersionConfigProcessor.this, 3);
            }
        }
    }

    private void a(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Set<String> a2 = this.f16912a.a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
        for (String str : a2) {
            if (!StringUtils.isEmpty(str)) {
                String str2 = null;
                String string = defaultSharedPreferences.getString("lbs_cfg_person_config_md5_" + str, null);
                if (map != null && map.containsKey(str)) {
                    str2 = c.a(map.get(str).toString());
                }
                if (StringUtils.isEmpty(str2) && StringUtils.isEmpty(string)) {
                    nea.d("lbs_config_log_DelegatePersionConfigProcessor", "[configHandle] md5 null groupName: " + str);
                } else {
                    if (StringUtils.isEmpty(str2)) {
                        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                        edit.remove("lbs_cfg_person_config_md5_" + str);
                        edit.commit();
                        map.get(str);
                    }
                    if (StringUtils.isEmpty(string)) {
                        SharedPreferences.Editor edit2 = defaultSharedPreferences.edit();
                        edit2.putString("lbs_cfg_person_config_md5_" + str, str2);
                        edit2.commit();
                        map.get(str);
                    }
                    if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(string)) {
                        if (string.equals(str2)) {
                            nea.d("lbs_config_log_DelegatePersionConfigProcessor", "[configHandle] md5 equals groupName: " + str + ",md5=" + str2);
                        } else {
                            map.get(str);
                        }
                    }
                }
            }
        }
    }

    private void b(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.c).edit();
        edit.putString("lbs_cfg_person_config_key", JSON.toJSONString(map));
        edit.apply();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.c).edit();
        edit.putLong("lbs_cfg_last_update_time", System.currentTimeMillis());
        edit.apply();
    }

    private void c(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }
}
