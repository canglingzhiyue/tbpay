package com.taobao.tao.log;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import tb.jhc;
import tb.kge;
import tb.oko;
import tb.oku;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f20684a;

        static {
            kge.a(-1398229386);
            f20684a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("793552c5", new Object[0]) : f20684a;
        }
    }

    static {
        kge.a(-2003602785);
    }

    private c() {
    }

    public static synchronized c a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("793552c5", new Object[0]);
            }
            return a.a();
        }
    }

    public void a(String str, String str2, String str3, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573e4b8d", new Object[]{this, str, str2, str3, bArr});
            return;
        }
        f.a().h().a(oko.b, "RECEIVE MESSAGE COUNT", "成功接收到消息，还未开始处理");
        if (bArr == null) {
            Log.e("TLOG.CommandDataCenter", "msg is null");
            TLogEventHelper.a(com.taobao.tao.log.statistics.d.UT_TLOG_CMD_PARSE_ERR, ErrorCode.DATA_EMPTY, "onData msg is null");
            f.a().h().b(oko.f32142a, "NULL MESSAGE", "接收到的服务端消息为空");
            return;
        }
        try {
            String a2 = jhc.a().a(str, str2, str3, bArr);
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            f.a().h().a(oko.f32142a, "RECEIVE MESSAGE", "成功接收到消息");
            String str4 = "CommandDataCenter.onData : " + a2;
            oku.a().a(bArr, a2, str2, str);
        } catch (Exception e) {
            TLogEventHelper.a(com.taobao.tao.log.statistics.d.UT_TLOG_CMD_PARSE_ERR, ErrorCode.CODE_EXC, e.getMessage());
            f.a().h().a(oko.f32142a, "PARSE MESSAGE ERROR", e);
        }
    }
}
