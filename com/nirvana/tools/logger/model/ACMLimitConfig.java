package com.nirvana.tools.logger.model;

import mtopsdk.common.util.StringUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ACMLimitConfig implements Serializable {
    private boolean isLimited;
    private int limitCount;
    private int limitHours;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8091a;
        private int b;
        private int c;

        private a() {
        }

        public final a a(int i) {
            this.b = i;
            return this;
        }

        public final a a(boolean z) {
            this.f8091a = z;
            return this;
        }

        public final ACMLimitConfig a() {
            return new ACMLimitConfig(this);
        }

        public final a b(int i) {
            this.c = i;
            return this;
        }
    }

    public ACMLimitConfig() {
    }

    private ACMLimitConfig(a aVar) {
        this.isLimited = aVar.f8091a;
        this.limitCount = aVar.b;
        this.limitHours = aVar.c;
    }

    public static ACMLimitConfig fromJson(String str) {
        ACMLimitConfig aCMLimitConfig = new ACMLimitConfig();
        try {
            if (!StringUtils.isEmpty(str)) {
                com.nirvana.tools.jsoner.a.a(new JSONObject(str), aCMLimitConfig, (List<Field>) null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return aCMLimitConfig;
    }

    public static a newACMLimitConfig() {
        return new a();
    }

    public int getLimitCount() {
        return this.limitCount;
    }

    public int getLimitHours() {
        return this.limitHours;
    }

    public boolean isLimited() {
        return this.isLimited;
    }

    public void setLimitCount(int i) {
        this.limitCount = i;
    }

    public void setLimitHours(int i) {
        this.limitHours = i;
    }

    public void setLimited(boolean z) {
        this.isLimited = z;
    }

    public String toJsonString() {
        return com.nirvana.tools.jsoner.a.a(this, (List<Field>) null).toString();
    }
}
