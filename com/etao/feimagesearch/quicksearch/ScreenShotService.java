package com.etao.feimagesearch.quicksearch;

import android.content.Intent;
import android.os.IBinder;
import android.service.quicksettings.TileService;
import com.etao.feimagesearch.util.ah;
import tb.kge;

/* loaded from: classes3.dex */
public class ScreenShotService extends TileService {
    static {
        kge.a(172844326);
    }

    @Override // android.service.quicksettings.TileService, android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return super.onBind(intent);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        super.onStartListening();
        a();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        super.onTileAdded();
        a();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileRemoved() {
        super.onTileRemoved();
        a();
    }

    private void a() {
        try {
            if (getQsTile() == null) {
                return;
            }
            getQsTile().setState(1);
            getQsTile().updateTile();
        } catch (Throwable unused) {
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        super.onClick();
        Intent intent = new Intent(this, ScreenRecordActivity.class);
        intent.putExtra(b.FOREGROUND_KEY, !com.taobao.application.common.c.a().a("isInBackground", false));
        intent.addFlags(268435456);
        startActivityAndCollapse(intent);
        ah.b(this);
    }
}
