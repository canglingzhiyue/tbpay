package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.SwashLettersMsg;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class EffectResPosition implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean alignBottom;
    public boolean alignRight;
    public int height;
    public int marginX;
    public int marginY;
    public int width;

    static {
        kge.a(-1658592868);
        kge.a(-540945145);
    }

    public static EffectResPosition convertToPosition(Context context, EffectResConfig effectResConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EffectResPosition) ipChange.ipc$dispatch("98f2dafb", new Object[]{context, effectResConfig});
        }
        if (context == null || effectResConfig == null) {
            return null;
        }
        EffectResPosition effectResPosition = new EffectResPosition();
        if (effectResConfig.flexWidth > 0.0f) {
            effectResPosition.width = (int) ((effectResConfig.flexWidth * d.e()) + 0.5f);
            effectResPosition.height = (effectResPosition.width * effectResConfig.height) / effectResConfig.width;
        } else if (effectResConfig.flexHeight > 0.0f) {
            effectResPosition.height = (int) ((effectResConfig.flexHeight * d.f()) + 0.5f);
            effectResPosition.width = (effectResPosition.height * effectResConfig.width) / effectResConfig.height;
        } else {
            effectResPosition.width = d.a(context, effectResConfig.width);
            effectResPosition.height = d.a(context, effectResConfig.height);
        }
        if (effectResConfig.gravity != null) {
            if (effectResConfig.gravity.contains("right")) {
                effectResPosition.alignRight = true;
            }
            if (effectResConfig.gravity.contains("bottom")) {
                effectResPosition.alignBottom = true;
            }
            if (effectResConfig.gravity.contains("centerX")) {
                effectResPosition.marginX = (int) (((effectResConfig.centerX * d.e()) - (effectResPosition.width / 2)) + 0.5f);
            } else {
                effectResPosition.marginX = d.a(context, effectResConfig.marginX);
            }
            if (effectResConfig.gravity.contains("centerY")) {
                effectResPosition.marginY = (int) (((effectResConfig.centerY * d.f()) - (effectResPosition.height / 2)) + 0.5f);
            } else {
                effectResPosition.marginY = d.a(context, effectResConfig.marginY);
            }
        }
        return effectResPosition;
    }

    public static EffectResPosition convertToPosition(Context context, SwashLettersMsg.StaticResource staticResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EffectResPosition) ipChange.ipc$dispatch("5c3fa068", new Object[]{context, staticResource});
        }
        if (staticResource == null) {
            return null;
        }
        EffectResConfig effectResConfig = new EffectResConfig();
        effectResConfig.width = staticResource.width;
        effectResConfig.height = staticResource.height;
        effectResConfig.flexWidth = staticResource.flexWidth;
        effectResConfig.flexHeight = staticResource.flexHeight;
        effectResConfig.gravity = staticResource.gravity;
        effectResConfig.marginX = staticResource.marginX;
        effectResConfig.marginY = staticResource.marginY;
        effectResConfig.centerX = staticResource.centerX;
        effectResConfig.centerY = staticResource.centerY;
        return convertToPosition(context, effectResConfig);
    }
}
