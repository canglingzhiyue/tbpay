package com.taobao.trtc.rtcroom;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.window.FloatWindowListener;
import com.taobao.message.window.FloatWindowManager;
import com.taobao.message.window.FloatWindowVO;
import com.taobao.trtc.call.TrtcCallImpl;
import com.taobao.trtc.utils.TrtcLog;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class e implements FloatWindowListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f23168a;
    private boolean b;
    private final h c;
    private final Context d;
    private TrtcCallImpl.CallStatus e;
    private a f;
    private final FloatWindowManager g;

    static {
        kge.a(-1968650446);
        kge.a(1801266684);
    }

    @Override // com.taobao.message.window.FloatWindowListener
    public void onLifecycleChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47430d13", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.d("FloatWindowAdapter", "status change : " + i);
        if (i == 0) {
            this.f23168a = true;
            this.c.c("on");
        } else if (i != 1) {
        } else {
            this.f23168a = false;
            this.c.c("off");
        }
    }

    @Override // com.taobao.message.window.FloatWindowListener
    public void onClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        TrtcLog.d("FloatWindowAdapter", "onClick");
        h hVar = this.c;
        if (hVar == null) {
            return;
        }
        hVar.c("click");
    }

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23169a;
        public String b;
        public String c;
        public boolean d;
        public int e;
        public Map<String, String> f;

        static {
            kge.a(801296940);
        }

        private a() {
        }
    }

    public e(Context context, h hVar, JSONObject jSONObject) {
        this.c = hVar;
        this.d = context;
        a(jSONObject, false);
        this.g = FloatWindowManager.getInstance();
        this.g.addListener(this);
        this.b = false;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f23168a) {
        } else {
            int p = this.c.p();
            String b = b(this.e);
            if (!this.b) {
                TrtcLog.d("FloatWindowAdapter", "create float window");
                this.b = true;
                FloatWindowVO floatWindowVO = new FloatWindowVO();
                floatWindowVO.setIconUrl(this.f.f23169a);
                floatWindowVO.setIconBackgroundUrl(this.f.b);
                floatWindowVO.setNavUrl(this.f.c);
                floatWindowVO.setBigMode(this.f.d);
                floatWindowVO.setGravity(this.f.e);
                this.g.create(floatWindowVO);
            }
            if (this.g != null) {
                this.g.setText(b);
                this.g.setIcon(this.f.f23169a);
                this.g.setIconBackground(this.f.b);
                if (this.e == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                    this.g.setTimeSecond(p / 1000);
                }
                this.g.setVisible(true);
            }
            this.f23168a = true;
            TrtcLog.d("FloatWindowAdapter", "Start | duration: " + p + ", text: " + b + ", icon: " + this.f.f23169a + ", iconBg: " + this.f.b + ", status: " + this.e + ", nav: " + this.f.c + ", bigMode: " + this.f.d + ", gravity: " + this.f.e);
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f23168a) {
        } else {
            TrtcLog.b("FloatWindowAdapter", "stop");
            this.f23168a = false;
            if (this.g != null) {
                this.g.setVisible(false);
            }
        }
    }

    public synchronized void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null) {
            String string = jSONObject2.getString("icon");
            if (!StringUtils.isEmpty(string)) {
                TrtcLog.d("FloatWindowAdapter", "[serverCmd] Update iconUrl: " + string);
                this.f.f23169a = string;
                if (this.g != null && this.f23168a) {
                    this.g.setIcon(string);
                }
            }
        }
    }

    private String b(TrtcCallImpl.CallStatus callStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a609b46f", new Object[]{this, callStatus});
        }
        try {
            if (callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_CALLING) {
                return this.f.f.get("waitAnswerText");
            }
            if (callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                return this.f.f.get("answeredText");
            }
            return callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_IDLE ? this.f.f.get("hangUpText") : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public synchronized void a(TrtcCallImpl.CallStatus callStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f2e90", new Object[]{this, callStatus});
            return;
        }
        TrtcLog.d("FloatWindowAdapter", "Update call status: " + callStatus);
        this.e = callStatus;
        if (this.g != null && this.f23168a) {
            String b = b(callStatus);
            this.g.setText(b);
            TrtcLog.d("FloatWindowAdapter", "Update text: " + b);
            if (callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                TrtcLog.b("FloatWindowAdapter", "Update | callDuration: 1");
                this.g.setTimeSecond(1);
            }
        }
    }

    public synchronized void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            a(jSONObject, true);
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TrtcLog.d("FloatWindowAdapter", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        if (this.g != null) {
            this.b = false;
            this.g.removeListener(this);
            this.g.destroy();
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f23168a;
    }

    private void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        if (jSONObject == null) {
            TrtcLog.a("FloatWindowAdapter", "config is null");
        } else {
            TrtcLog.d("FloatWindowAdapter", "parserConfig: " + jSONObject.toJSONString());
        }
        if (this.f == null) {
            this.f = new a();
            a aVar = this.f;
            aVar.f23169a = "";
            aVar.c = "";
            aVar.b = "";
            aVar.f = new HashMap();
            this.f.f.put("waitAnswerText", "呼叫中");
            this.f.f.put("answeredText", "通话中");
            this.f.f.put("hangUpText", "已结束");
        }
        if (jSONObject == null) {
            return;
        }
        try {
            String a2 = com.taobao.trtc.utils.a.a(jSONObject, "iconUrl", this.f.f23169a);
            if (!StringUtils.isEmpty(a2) && !a2.equalsIgnoreCase(this.f.f23169a)) {
                this.f.f23169a = a2;
                if (this.f23168a && this.g != null) {
                    this.g.setIcon(a2);
                    TrtcLog.d("FloatWindowAdapter", "Update iconUrl: " + a2);
                }
            }
            String a3 = com.taobao.trtc.utils.a.a(jSONObject, "iconBgUrl", this.f.b);
            if (!StringUtils.isEmpty(a3) && !a3.equalsIgnoreCase(this.f.b)) {
                this.f.b = a3;
                if (this.f23168a && this.g != null) {
                    this.g.setIconBackground(a3);
                    TrtcLog.d("FloatWindowAdapter", "Update iconBgUrl: " + a3);
                }
            }
            String a4 = com.taobao.trtc.utils.a.a(jSONObject, "navUrl", this.f.c);
            if (!StringUtils.isEmpty(a4) && !a4.equalsIgnoreCase(this.f.c)) {
                this.f.c = a4;
            }
            if (!z) {
                this.f.d = com.taobao.trtc.utils.a.a(jSONObject, "bigMode", false);
                this.f.e = com.taobao.trtc.utils.a.a(jSONObject, "gravity", 85);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("textList");
            if (jSONObject2 == null) {
                return;
            }
            String string = jSONObject2.getString("waitAnswerText");
            if (!StringUtils.isEmpty(string)) {
                this.f.f.put("waitAnswerText", string);
            }
            String string2 = jSONObject2.getString("answeredText");
            if (!StringUtils.isEmpty(string2)) {
                this.f.f.put("answeredText", string2);
            }
            String string3 = jSONObject2.getString("hangUpText");
            if (!StringUtils.isEmpty(string3)) {
                this.f.f.put("hangUpText", string3);
            }
            if (!this.f23168a || this.g == null) {
                return;
            }
            String b = b(this.e);
            this.g.setText(b);
            TrtcLog.d("FloatWindowAdapter", "Update text: " + b);
        } catch (Throwable unused) {
        }
    }
}
