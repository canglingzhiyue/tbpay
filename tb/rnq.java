package tb;

import android.text.TextUtils;
import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.UploaderManager;
import com.uploader.implement.a;
import com.uploader.implement.d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rnq implements rny {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33245a;
    private rnp b;
    private rok c;
    private long d;
    private final d.a.b e;
    private final int f = hashCode();
    private final rob g;
    private final String h;
    private final d i;

    @Override // tb.rny
    public /* synthetic */ rod c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rod) ipChange.ipc$dispatch("1e6d6ef5", new Object[]{this}) : a();
    }

    public rnq(d dVar, rnp rnpVar, String str, long j, long j2, boolean z) throws Exception {
        this.i = dVar;
        this.b = rnpVar;
        this.f33245a = z;
        this.e = dVar.f24068a.d();
        if (this.e == null) {
            throw new RuntimeException("currentUploadTarget is null");
        }
        this.h = (String) dVar.f24068a.a().first;
        this.d = dVar.f24068a.g();
        this.g = new rob(rnpVar.b, rnpVar.k, j, j2, null, a(j, j2, str).getBytes("UTF-8"), j < rnpVar.g ? "\r\n\r\n".getBytes() : null, rnpVar.l);
    }

    public rok a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rok) ipChange.ipc$dispatch("f0a2510", new Object[]{this});
        }
        rok rokVar = this.c;
        if (rokVar != null) {
            return rokVar;
        }
        rok rokVar2 = new rok(this.e.f24072a, this.e.b, true, this.e.d, this.e.c);
        this.c = rokVar2;
        return rokVar2;
    }

    @Override // tb.rny
    public rob b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rob) ipChange.ipc$dispatch("16bbc958", new Object[]{this}) : this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        r15 = r20 - r7.available();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0069 A[SYNTHETIC] */
    @Override // tb.rny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<tb.rnz, java.lang.Integer> a(java.util.Map<java.lang.String, java.lang.String> r17, byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rnq.a(java.util.Map, byte[], int, int):android.util.Pair");
    }

    private rnz b(Map<String, String> map, byte[] bArr, int i, int i2) {
        rns rnsVar;
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return (rnz) ipChange.ipc$dispatch("cc2e7545", new Object[]{this, map, bArr, new Integer(i), new Integer(i2)});
        }
        Map<String, String> hashMap = map == null ? new HashMap<>() : map;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i, i2)));
        hashMap.put("divided_length", Integer.toString(i2));
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    } else if (!TextUtils.isEmpty(readLine)) {
                        int length = readLine.length();
                        int indexOf = readLine.indexOf(":");
                        if (indexOf > i3) {
                            String substring = readLine.substring(0, indexOf);
                            if (indexOf < length) {
                                hashMap.put(substring.trim(), rnw.a(readLine.substring(indexOf + 1, length)));
                            }
                        } else {
                            int indexOf2 = readLine.indexOf(" ");
                            if (indexOf2 > i3) {
                                String substring2 = readLine.substring(0, indexOf2);
                                if (indexOf2 < length) {
                                    String substring3 = readLine.substring(indexOf2 + 1, length);
                                    hashMap.put("response_code", substring2);
                                    hashMap.put("response_msg", substring3);
                                }
                            }
                            i3 = 1;
                        }
                    }
                } catch (IOException e) {
                    if (a.a(16)) {
                        a.a(16, "FileUploadActionRequest", this.f + " decode response header failed", e);
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        if (hashMap.get("x-arup-process") != null) {
            rnsVar = new rns(2, hashMap);
        } else if (hashMap.get("x-arup-offset") != null) {
            rnsVar = new rns(3, hashMap);
        } else if (hashMap.get("x-arup-file-status") != null) {
            rnsVar = new rns(4, hashMap);
        } else if (hashMap.get("x-arup-error-code") != null) {
            rnsVar = new rns(5, hashMap);
        } else if (hashMap.get("x-arup-session-status") == null) {
            return null;
        } else {
            rnsVar = new rns(6, hashMap);
        }
        hashMap.put("divided_length", Integer.toString(i2));
        if (a.a(4)) {
            a.a(4, "FileUploadActionRequest", this.f + " decode actionResponse header:" + hashMap.toString());
        }
        return rnsVar;
    }

    private final String a(long j, long j2, String str) throws Exception {
        String str2;
        String str3;
        StringBuilder sb;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f7d642e", new Object[]{this, new Long(j), new Long(j2), str});
        }
        if (this.f33245a) {
            String str5 = this.i.b.a().b;
            String utdid = this.i.b.getUtdid();
            String appVersion = this.i.b.getAppVersion();
            String valueOf = String.valueOf(this.d + (System.currentTimeMillis() / 1000));
            String a2 = roz.a();
            HashMap hashMap = new HashMap();
            hashMap.put("host", "arup.alibaba.com");
            hashMap.put("content-type", "application/offset+octet-stream");
            hashMap.put("x-arup-version", "2.3.2");
            hashMap.put("x-arup-device-id", utdid);
            hashMap.put("x-arup-appkey", str5);
            hashMap.put("x-arup-appversion", appVersion);
            hashMap.put("x-arup-file-count", Integer.toString(1));
            String userId = this.i.b.getUserId();
            if (!TextUtils.isEmpty(userId)) {
                hashMap.put("x-arup-userinfo", userId);
            }
            hashMap.put("x-arup-timestamp", valueOf);
            if ("patch".equals(str)) {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append(this.b.e);
                sb2.append("=");
                sb2.append(j);
                str2 = "application/offset+octet-stream";
                hashMap.put("x-arup-req-offset", sb2.toString());
                sb2.setLength(0);
                sb2.append(this.b.e);
                sb2.append("=");
                str4 = utdid;
                sb2.append(String.valueOf(this.b.g));
                hashMap.put("x-arup-req-offset-file-length", sb2.toString());
            } else {
                str2 = "application/offset+octet-stream";
                str4 = utdid;
            }
            StringBuilder sb3 = new StringBuilder(128);
            sb3.append(this.b.f);
            sb3.append("&");
            sb3.append(this.h);
            sb3.append("&");
            sb3.append(str5);
            sb3.append("&");
            sb3.append(appVersion);
            sb3.append("&");
            sb3.append(str4);
            sb3.append("&");
            sb3.append(valueOf);
            String signature = this.i.b.signature(sb3.toString());
            if (TextUtils.isEmpty(signature)) {
                if (a.a(16)) {
                    a.a(16, "FileUploadActionRequest", this.f + " compute upload sign failed.");
                }
                throw new Exception("compute api sign failed.");
            }
            hashMap.put("x-arup-sign", signature);
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("x-arup-network-type", a2);
            }
            hashMap.put("x-arup-conn-seq-no", rnw.a());
            sb = new StringBuilder(128);
            sb.append(str);
            sb.append(" ");
            sb.append("/");
            sb.append("f");
            sb.append("/");
            sb.append(this.b.f);
            sb.append("/");
            sb.append(this.h);
            sb.append(" ");
            sb.append(ProtocolVersions.HTTP_1_1);
            sb.append("\r\n");
            for (Map.Entry entry : hashMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append(rnw.b((String) entry.getValue()));
                sb.append("\r\n");
            }
            str3 = ":";
            sb.append("\r\n");
        } else {
            str2 = "application/offset+octet-stream";
            str3 = ":";
            sb = null;
        }
        if (j < this.b.g) {
            if (sb == null) {
                sb = new StringBuilder(128);
            }
            sb.append("--");
            sb.append(rnw.b(this.b.e));
            sb.append("--");
            sb.append("\r\n");
            if (this.b.i != null && this.b.i.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry2 : this.b.i.entrySet()) {
                    String key = entry2.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        jSONObject.put(key, entry2.getValue());
                    }
                }
                sb.append("x-arup-meta");
                sb.append(str3);
                sb.append(rnw.b(jSONObject.toString()));
                sb.append("\r\n");
            }
            sb.append("x-arup-file-md5");
            sb.append(str3);
            sb.append(rnw.b(this.b.h));
            sb.append("\r\n");
            sb.append("x-arup-file-crc64");
            sb.append(str3);
            sb.append(rnw.b(this.b.m));
            sb.append("\r\n");
            sb.append("x-arup-file-name");
            sb.append(str3);
            sb.append(rnw.b(this.b.d));
            sb.append("\r\n");
            sb.append("x-arup-range");
            sb.append(str3);
            sb.append(j);
            sb.append(",");
            sb.append(j2);
            sb.append("\r\n");
            sb.append("x-arup-file-length");
            sb.append(str3);
            sb.append(String.valueOf(this.b.g));
            sb.append("\r\n");
            sb.append("x-arup-mime-type");
            sb.append(str3);
            sb.append(rnw.b(!TextUtils.isEmpty(this.b.n) ? this.b.n : str2));
            sb.append("\r\n");
            sb.append("x-arup-task-type");
            sb.append(str3);
            sb.append(this.b.o);
            sb.append("\r\n");
            sb.append("x-arup-concur-task-count");
            sb.append(str3);
            sb.append(UploaderManager.b());
            sb.append("\r\n");
            sb.append("x-arup-phase-index");
            sb.append(str3);
            sb.append(this.b.q);
            sb.append("\r\n\r\n");
        }
        if (sb == null) {
            return null;
        }
        if (a.a(2)) {
            String sb4 = sb.toString();
            String str6 = "";
            int i = 0;
            while (true) {
                int indexOf = sb4.indexOf("\r\n", i);
                if (indexOf == -1) {
                    break;
                }
                str6 = str6 + sb4.substring(i, indexOf) + "\n";
                i = indexOf + 2;
            }
            a.a(2, "FileUploadActionRequest", this.f + " create upload header:" + str6);
        }
        return sb.toString();
    }
}
