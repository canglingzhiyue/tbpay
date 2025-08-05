package com.taobao.themis.container.splash.entity;

import tb.kge;

/* loaded from: classes9.dex */
public class ErrorInfo {

    /* renamed from: a  reason: collision with root package name */
    public String f22390a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public buttonActionType h;

    /* loaded from: classes9.dex */
    public enum buttonActionType {
        refresh("refresh"),
        back("back"),
        update("update");
        
        String mAction;

        buttonActionType(String str) {
            this.mAction = str;
        }

        public String getAction() {
            return this.mAction;
        }
    }

    static {
        kge.a(-1492308402);
    }
}
