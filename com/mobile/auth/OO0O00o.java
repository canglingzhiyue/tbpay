package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.logger.model.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dao;

/* loaded from: classes4.dex */
public abstract class OO0O00o<T extends c> implements dao<T> {
    protected com.mobile.auth.gatewayauth.O000000o O000000o;

    public void O000000o(com.mobile.auth.gatewayauth.O000000o o000000o) {
        try {
            this.O000000o = o000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    protected abstract boolean O000000o(String str);

    @Override // tb.dao
    public boolean upload(List<T> list) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (T t : list) {
                String f = t.f();
                if (!TextUtils.isEmpty(f)) {
                    try {
                        jSONArray.put(new JSONObject(f));
                    } catch (Exception e) {
                        com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(e);
                    }
                }
            }
            return O000000o(jSONArray.toString());
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
