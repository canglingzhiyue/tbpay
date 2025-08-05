package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.common.c;
import com.taobao.monitor.procedure.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/* loaded from: classes7.dex */
public class mmw implements mpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f31120a = {"http://pre-tmq2.alibaba-inc.com/api/tmqsdk/apm/uploadRealTime"};
    private static final String[] b = {"http://tmq-service.taobao.org/api/tmqsdk/apm/uploadRealTime"};

    @Override // tb.mpl
    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(mms.n)) {
                return;
            }
            a(str, str2);
        } catch (Throwable th) {
            mpi.c("RealtimeTmqUploadSender", th);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        String[] strArr = mms.f31118a == 1 ? f31120a : b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("simpleTopic", (Object) a(str));
        jSONObject.put("utdid", (Object) d.h);
        jSONObject.put("traceId", (Object) mms.n);
        jSONObject.put("traceIdSource", (Object) mms.o);
        jSONObject.put("apmData", (Object) str2);
        for (String str3 : strArr) {
            mpi.c("RealtimeTmqUploadSender", "requestUrl", str3, "simpleTopic", a(str));
            b(str3, jSONObject.toJSONString());
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    private static void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            c.a(new Runnable() { // from class: tb.mmw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v11, types: [java.net.HttpURLConnection] */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v3 */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.net.HttpURLConnection] */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.net.HttpURLConnection] */
                /* JADX WARN: Type inference failed for: r1v7, types: [java.net.HttpURLConnection] */
                /* JADX WARN: Type inference failed for: r1v8, types: [java.net.HttpURLConnection] */
                @Override // java.lang.Runnable
                public void run() {
                    OutputStream outputStream;
                    IpChange ipChange2 = $ipChange;
                    ?? r1 = ipChange2 instanceof IpChange;
                    if (r1 != 0) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BufferedReader bufferedReader = null;
                    try {
                        try {
                            r1 = (HttpURLConnection) new URL(str).openConnection();
                            try {
                                r1.setRequestMethod("POST");
                                r1.setConnectTimeout(5000);
                                r1.setReadTimeout(5000);
                                r1.setRequestProperty("Content-Type", "application/json; utf-8");
                                try {
                                    outputStream = r1.getOutputStream();
                                } catch (Throwable th) {
                                    th = th;
                                    outputStream = null;
                                }
                                try {
                                    byte[] bytes = str2.getBytes("utf-8");
                                    outputStream.write(bytes, 0, bytes.length);
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(r1.getInputStream()));
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        while (true) {
                                            String readLine = bufferedReader2.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            sb.append(readLine);
                                        }
                                        mpi.c("RealtimeTmqUploadSender", sb.toString());
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        if (r1 == 0) {
                                            return;
                                        }
                                        r1.disconnect();
                                    } catch (MalformedURLException e2) {
                                        e = e2;
                                        bufferedReader = bufferedReader2;
                                        e.printStackTrace();
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException e3) {
                                                e3.printStackTrace();
                                            }
                                        }
                                        if (r1 == 0) {
                                            return;
                                        }
                                        r1.disconnect();
                                    } catch (ProtocolException e4) {
                                        e = e4;
                                        bufferedReader = bufferedReader2;
                                        e.printStackTrace();
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException e5) {
                                                e5.printStackTrace();
                                            }
                                        }
                                        if (r1 == 0) {
                                            return;
                                        }
                                        r1.disconnect();
                                    } catch (IOException e6) {
                                        e = e6;
                                        bufferedReader = bufferedReader2;
                                        e.printStackTrace();
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException e7) {
                                                e7.printStackTrace();
                                            }
                                        }
                                        if (r1 == 0) {
                                            return;
                                        }
                                        r1.disconnect();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedReader = bufferedReader2;
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException e8) {
                                                e8.printStackTrace();
                                            }
                                        }
                                        if (r1 != 0) {
                                            r1.disconnect();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (MalformedURLException e9) {
                                e = e9;
                            } catch (ProtocolException e10) {
                                e = e10;
                            } catch (IOException e11) {
                                e = e11;
                            }
                        } catch (MalformedURLException e12) {
                            e = e12;
                            r1 = 0;
                        } catch (ProtocolException e13) {
                            e = e13;
                            r1 = 0;
                        } catch (IOException e14) {
                            e = e14;
                            r1 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            r1 = 0;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            });
        }
    }
}
