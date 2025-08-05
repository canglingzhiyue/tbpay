package com.alipay.birdnest.store;

import android.content.Context;
import android.content.res.Resources;
import com.alipay.android.app.template.Template;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public class TemplateStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated
    public TemplateStorage(Context context, boolean z, BirdNestEngine.LogTracer logTracer) {
    }

    @Deprecated
    public Template getTemplate(String str, Resources resources) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("fd91a03b", new Object[]{this, str, resources});
        }
        return null;
    }

    @Deprecated
    public Template getTemplateFromResource(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("8f55a01f", new Object[]{this, resources, str});
        }
        return null;
    }

    @Deprecated
    public boolean removeInMemTpl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80143919", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Deprecated
    public void removeTpl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fda8bdd", new Object[]{this, str});
        }
    }

    @Deprecated
    public Map<String, Boolean> saveTemplate(List<Template> list) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5eb6e304", new Object[]{this, list});
        }
        return null;
    }

    @Deprecated
    public boolean saveTemplate(Template template) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("803af907", new Object[]{this, template})).booleanValue();
        }
        return false;
    }
}
