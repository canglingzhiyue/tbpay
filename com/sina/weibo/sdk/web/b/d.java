package com.sina.weibo.sdk.web.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.sina.weibo.sdk.a.b;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.web.b.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public final class d extends b {
    public WeiboMultiMessage aE;
    private byte[] aF;
    String aG;
    public String ae;
    public String packageName;
    private String text;

    static {
        kge.a(1602311048);
    }

    public d(Context context) {
        this.Z = context;
    }

    public d(AuthInfo authInfo) {
        super(authInfo, 1, null, null);
    }

    @Override // com.sina.weibo.sdk.web.b.b
    protected final void a(Bundle bundle) {
        WeiboMultiMessage weiboMultiMessage = this.aE;
        if (weiboMultiMessage != null) {
            weiboMultiMessage.writeToBundle(bundle);
        }
        bundle.putString("token", this.ae);
        bundle.putString("packageName", this.packageName);
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final void a(final b.a aVar) {
        com.sina.weibo.sdk.a.b bVar;
        com.sina.weibo.sdk.a.d dVar = new com.sina.weibo.sdk.a.d(this.Z, new String(this.aF), this.aC.a().getAppKey(), this.ae, new com.sina.weibo.sdk.net.c<String>() { // from class: com.sina.weibo.sdk.web.b.d.1
            @Override // com.sina.weibo.sdk.net.c
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                com.sina.weibo.sdk.b.c.a("WbShareTag", "handle image result :".concat(String.valueOf(str2)));
                if (StringUtils.isEmpty(str2)) {
                    b.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.onError("处理图片，服务端返回null!");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    int optInt = jSONObject.optInt("code");
                    String optString = jSONObject.optString("data");
                    if (optInt != 1 || StringUtils.isEmpty(optString)) {
                        if (aVar == null) {
                            return;
                        }
                        aVar.onError("图片内容不合适，禁止上传！");
                        return;
                    }
                    d.this.aG = optString;
                    if (aVar == null) {
                        return;
                    }
                    aVar.onComplete();
                } catch (JSONException e) {
                    e.printStackTrace();
                    b.a aVar3 = aVar;
                    if (aVar3 == null) {
                        return;
                    }
                    aVar3.onError("解析服务端返回的字符串时发生异常！");
                }
            }

            @Override // com.sina.weibo.sdk.net.c
            public final void onError(Throwable th) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.onError(th.getMessage());
                }
            }
        });
        bVar = b.a.K;
        bVar.a(dVar);
    }

    @Override // com.sina.weibo.sdk.web.b.b
    protected final void b(Bundle bundle) {
        byte[] bArr;
        this.aE = new WeiboMultiMessage();
        this.aE.readFromBundle(bundle);
        this.ae = bundle.getString("token");
        this.packageName = bundle.getString("packageName");
        StringBuilder sb = new StringBuilder();
        if (this.aE.textObject != null) {
            sb.append(this.aE.textObject.text);
        }
        if (this.aE.imageObject != null) {
            ImageObject imageObject = this.aE.imageObject;
            String str = imageObject.imagePath;
            if (!StringUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    byte[] bArr2 = new byte[(int) file.length()];
                    FileInputStream fileInputStream = null;
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(file);
                            try {
                                fileInputStream2.read(bArr2);
                                this.aF = e.b(bArr2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                bArr = imageObject.imageData;
                                if (bArr != null) {
                                    this.aF = e.b(bArr);
                                }
                                this.text = sb.toString();
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            bArr = imageObject.imageData;
            if (bArr != null && bArr.length > 0) {
                this.aF = e.b(bArr);
            }
        }
        this.text = sb.toString();
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final String getUrl() {
        Uri.Builder buildUpon = Uri.parse("https://service.weibo.com/share/mobilesdk.php").buildUpon();
        buildUpon.appendQueryParameter("title", this.text);
        buildUpon.appendQueryParameter("version", "0041005000");
        String appKey = this.aC.a().getAppKey();
        if (!StringUtils.isEmpty(appKey)) {
            buildUpon.appendQueryParameter("source", appKey);
        }
        if (!StringUtils.isEmpty(this.ae)) {
            buildUpon.appendQueryParameter("access_token", this.ae);
        }
        if (!StringUtils.isEmpty(this.packageName)) {
            buildUpon.appendQueryParameter(NewHtcHomeBadger.PACKAGENAME, this.packageName);
        }
        if (!StringUtils.isEmpty(this.aG)) {
            buildUpon.appendQueryParameter("picinfo", this.aG);
        }
        buildUpon.appendQueryParameter("luicode", "10000360");
        buildUpon.appendQueryParameter("lfid", "OP_".concat(String.valueOf(appKey)));
        return buildUpon.build().toString();
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final boolean t() {
        byte[] bArr = this.aF;
        if (bArr == null || bArr.length <= 0) {
            return super.t();
        }
        return true;
    }
}
