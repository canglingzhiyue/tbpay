package com.etao.feimagesearch.util;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.com;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(784156392);
    }

    public static a a(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("da8b27ba", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return new a("url_empty", "url empty");
        }
        try {
            Response syncSend = new DegradableNetwork(com.b()).syncSend(new RequestImpl(str), null);
            int statusCode = syncSend.getStatusCode();
            if (statusCode != 200) {
                return new a(String.valueOf(statusCode), syncSend.getDesc());
            }
            Map<String, List<String>> connHeadFields = syncSend.getConnHeadFields();
            String str2 = "UTF-8";
            if (connHeadFields != null && (list = connHeadFields.get("Content-Type")) != null && list.size() > 0) {
                String str3 = list.get(0);
                if (str3.contains("charset=")) {
                    str2 = str3.substring(str3.indexOf("charset=") + 8).trim();
                }
            }
            return new a(syncSend.getBytedata(), str2);
        } catch (Exception e) {
            cot.b("HttpUtil", "fail to request with the url" + str);
            return new a(e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f7027a;
        private String b;
        private String c;
        private String d;

        static {
            kge.a(-351556231);
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (a()) {
            } else {
                this.b = "empty_data";
                this.c = "empty data";
            }
        }

        public a(String str, String str2) {
            this.b = "";
            this.c = "";
            this.d = "UTF-8";
            this.b = str;
            this.c = str2 == null ? "" : str2;
        }

        public a(byte[] bArr, String str) {
            this.b = "";
            this.c = "";
            this.d = "UTF-8";
            this.f7027a = bArr;
            this.d = str;
            c();
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            byte[] bArr = this.f7027a;
            return bArr != null && bArr.length > 0;
        }

        public byte[] b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this}) : this.f7027a;
        }
    }
}
