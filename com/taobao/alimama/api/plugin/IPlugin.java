package com.taobao.alimama.api.plugin;

import com.taobao.alimama.api.AbsServiceImpl;
import java.util.Map;

/* loaded from: classes4.dex */
public interface IPlugin {
    Map<Class<?>, Class<? extends AbsServiceImpl>> services();
}
