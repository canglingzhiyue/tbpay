package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.Map;

/* loaded from: classes8.dex */
public interface e {
    public static final String ACTION_ARGS = "actionArgs";
    public static final String ACTION_NAME = "actionName";
    public static final String BIZ_ARGS = "bizArgs";
    public static final String BIZ_CONFIG = "bizConfig";
    public static final String BIZ_ID = "bizId";
    public static final String BIZ_NAME = "bizName";
    public static final String OFFSETX = "currentOffsetX";
    public static final String OFFSETY = "currentOffsetY";
    public static final String REQUEST_ID = "requestId";
    public static final String SCENE = "scene";
    public static final String TARGET = "target";

    void a(g.c cVar, Map map);

    void a(ab abVar, Map map);

    void b(ab abVar, Map map);

    void c(ab abVar, Map map);

    void d(ab abVar, Map map);

    void e(ab abVar, Map map);

    void f(ab abVar, Map map);

    void g(ab abVar, Map map);

    void h(ab abVar, Map map);

    void i(ab abVar, Map map);
}
