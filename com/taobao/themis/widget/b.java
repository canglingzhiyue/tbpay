package com.taobao.themis.widget;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taolive.room.utils.aw;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.utils.k;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.nfc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b¨\u0006\r"}, d2 = {"Lcom/taobao/themis/widget/TMSWidgetUtils;", "", "()V", "getSystemInfo", "Lcom/alibaba/fastjson/JSONObject;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getWidgetEnvironment", "", "getWidgetEnvironmentJs", "loadRawDataFromURL", "", RVStartParams.KEY_URL_SHORT, "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    static {
        kge.a(208703816);
        INSTANCE = new b();
    }

    private b() {
    }

    public final String a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9586a13", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "systemInfo", INSTANCE.c(instance).toJSONString());
        WidgetStartParams widgetStartParams = (WidgetStartParams) instance.a(WidgetStartParams.class);
        String str = null;
        jSONObject2.put((JSONObject) "sceneParams", widgetStartParams != null ? widgetStartParams.getSceneParams() : null);
        jSONObject2.put((JSONObject) "widgetUrl", instance.g());
        WidgetStartParams widgetStartParams2 = (WidgetStartParams) instance.a(WidgetStartParams.class);
        jSONObject2.put((JSONObject) "widgetWidth", widgetStartParams2 != null ? widgetStartParams2.getWidth() : null);
        WidgetStartParams widgetStartParams3 = (WidgetStartParams) instance.a(WidgetStartParams.class);
        jSONObject2.put((JSONObject) "widgetHeight", widgetStartParams3 != null ? widgetStartParams3.getHeight() : null);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        WidgetStartParams widgetStartParams4 = (WidgetStartParams) instance.a(WidgetStartParams.class);
        if (widgetStartParams4 != null) {
            str = widgetStartParams4.getSpmOri();
        }
        jSONObject4.put((JSONObject) "spm_ori", str);
        t tVar = t.INSTANCE;
        jSONObject2.put((JSONObject) aw.PARAM_UT_PARAMS, (String) jSONObject3);
        String jSONString = jSONObject.toJSONString();
        q.b(jSONString, "widgetEnvironment.toJSONString()");
        return jSONString;
    }

    public final String b(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb021032", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        return "var __widgetEnvironment=" + a(instance) + ";";
    }

    private final JSONObject c(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2cd314f", new Object[]{this, fVar});
        }
        Activity activity = fVar.o();
        q.b(activity, "activity");
        Resources resources = activity.getResources();
        q.b(resources, "activity.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.density;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "apiLevel", (String) Integer.valueOf(Build.VERSION.SDK_INT));
        jSONObject2.put((JSONObject) "app", RVEnvironmentService.PLATFORM_TB);
        jSONObject2.put((JSONObject) "brand", Build.BRAND);
        jSONObject2.put((JSONObject) "currentBattery", "100%");
        jSONObject2.put((JSONObject) "fontSizeSetting", (String) 16);
        jSONObject2.put((JSONObject) LoggingSPCache.STORAGE_LANGUAGE, AdvanceSetting.CLEAR_NOTIFICATION);
        jSONObject2.put((JSONObject) "model", Build.MANUFACTURER + " " + Build.MODEL);
        jSONObject2.put((JSONObject) nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, "middle");
        jSONObject2.put((JSONObject) "pixelRatio", (String) Float.valueOf(f));
        jSONObject2.put((JSONObject) "platform", "Android");
        jSONObject2.put((JSONObject) "platformType", "tb");
        jSONObject2.put((JSONObject) "screenHeight", (String) Integer.valueOf(displayMetrics.heightPixels));
        jSONObject2.put((JSONObject) com.taobao.android.detail2.core.framework.data.model.d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (String) Integer.valueOf(displayMetrics.widthPixels));
        Activity activity2 = activity;
        jSONObject2.put((JSONObject) "statusBarHeight", (String) Float.valueOf(k.b(activity2) / f));
        jSONObject2.put((JSONObject) "system", Build.VERSION.RELEASE);
        jSONObject2.put((JSONObject) "titleBarHeight", (String) 44);
        jSONObject2.put((JSONObject) "version", com.taobao.themis.utils.c.a(activity2));
        jSONObject2.put((JSONObject) "deviceOrientation", com.taobao.themis.kernel.utils.k.n(fVar));
        return jSONObject;
    }

    public final byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        try {
            Result.a aVar = Result.Companion;
            URLConnection openConnection = new URL(str).openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[2048];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    httpURLConnection.disconnect();
                    inputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(Result.m2371constructorimpl(i.a(th)));
            if (m2374exceptionOrNullimpl == null) {
                return null;
            }
            TMSLogger.b("TMS", "", m2374exceptionOrNullimpl);
            return null;
        }
    }
}
