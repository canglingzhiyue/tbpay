package io.unicorn.embedding.android;

import tb.kge;

/* loaded from: classes9.dex */
public class FlutterActivityLaunchConfigs {
    public static final String EXTRA_BACKGROUND_MODE = "background_mode";
    public static final String EXTRA_RENDER_CONTENT = "render_content";
    public static final String EXTRA_RENDER_TYPE = "render_type";
    public static final String EXTRA_RENDER_TYPE_ASSET = "asset";
    public static final String EXTRA_RENDER_TYPE_JS = "js";

    /* renamed from: a  reason: collision with root package name */
    static final String f24800a;

    /* loaded from: classes9.dex */
    public enum BackgroundMode {
        opaque,
        transparent
    }

    static {
        kge.a(985553291);
        f24800a = BackgroundMode.opaque.name();
    }
}
