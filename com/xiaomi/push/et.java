package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class et implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24463a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ es f336a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f337a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public et(es esVar, String str, Context context, String str2, String str3) {
        this.f336a = esVar;
        this.f337a = str;
        this.f24463a = context;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        es esVar;
        eu euVar;
        Context context;
        if (TextUtils.isEmpty(this.f337a)) {
            eo.a(this.f24463a, "null", 1008, "A receive a incorrect message with empty info");
            return;
        }
        try {
            eo.a(this.f24463a, this.f337a, 1001, "get message");
            JSONObject jSONObject = new JSONObject(this.f337a);
            String optString = jSONObject.optString("action");
            String optString2 = jSONObject.optString("awakened_app_packagename");
            String optString3 = jSONObject.optString("awake_app_packagename");
            String optString4 = jSONObject.optString("awake_app");
            String optString5 = jSONObject.optString("awake_type");
            int optInt = jSONObject.optInt("awake_foreground", 0);
            if (this.b.equals(optString3) && this.c.equals(optString4)) {
                if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                    eo.a(this.f24463a, this.f337a, 1008, "A receive a incorrect message with empty type");
                    return;
                }
                this.f336a.b(optString3);
                this.f336a.a(optString4);
                er erVar = new er();
                erVar.b(optString);
                erVar.a(optString2);
                erVar.a(optInt);
                erVar.d(this.f337a);
                if ("service".equals(optString5)) {
                    if (!TextUtils.isEmpty(optString)) {
                        esVar = this.f336a;
                        euVar = eu.SERVICE_ACTION;
                        context = this.f24463a;
                    } else {
                        erVar.c("com.xiaomi.mipush.sdk.PushMessageHandler");
                        esVar = this.f336a;
                        euVar = eu.SERVICE_COMPONENT;
                        context = this.f24463a;
                    }
                } else if (eu.ACTIVITY.f339a.equals(optString5)) {
                    esVar = this.f336a;
                    euVar = eu.ACTIVITY;
                    context = this.f24463a;
                } else if (!eu.PROVIDER.f339a.equals(optString5)) {
                    Context context2 = this.f24463a;
                    String str = this.f337a;
                    eo.a(context2, str, 1008, "A receive a incorrect message with unknown type " + optString5);
                    return;
                } else {
                    esVar = this.f336a;
                    euVar = eu.PROVIDER;
                    context = this.f24463a;
                }
                esVar.a(euVar, context, erVar);
                return;
            }
            Context context3 = this.f24463a;
            String str2 = this.f337a;
            eo.a(context3, str2, 1008, "A receive a incorrect message with incorrect package info" + optString3);
        } catch (JSONException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            eo.a(this.f24463a, this.f337a, 1008, "A meet a exception when receive the message");
        }
    }
}
