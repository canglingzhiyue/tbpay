package com.taobao.search.searchdoor.searchbar.data;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static final C0781a Companion;
    public static final String TYPE_IMAGE_TEXT = "imageText";
    public static final String TYPE_IMG = "image";
    public static final String TYPE_TEXT = "text";

    /* renamed from: a  reason: collision with root package name */
    private String f19356a;

    static {
        kge.a(-2121380540);
        Companion = new C0781a(null);
    }

    public a() {
        this(null, 1, null);
    }

    /* renamed from: com.taobao.search.searchdoor.searchbar.data.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0781a {
        static {
            kge.a(1008825228);
        }

        private C0781a() {
        }

        public /* synthetic */ C0781a(o oVar) {
            this();
        }
    }

    public a(String type) {
        q.c(type, "type");
        this.f19356a = type;
    }

    public /* synthetic */ a(String str, int i, o oVar) {
        this((i & 1) != 0 ? "text" : str);
    }
}
