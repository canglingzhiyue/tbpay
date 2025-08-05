package org.java_websocket;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes9.dex */
public abstract class a extends c {
    private Timer connectionLostTimer;
    private TimerTask connectionLostTimerTask;
    private boolean reuseAddr;
    private boolean tcpNoDelay;
    private int connectionLostTimeout = 60;
    private boolean websocketRunning = false;

    private void cancelConnectionLostTimer() {
        Timer timer = this.connectionLostTimer;
        if (timer != null) {
            timer.cancel();
            this.connectionLostTimer = null;
        }
        TimerTask timerTask = this.connectionLostTimerTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.connectionLostTimerTask = null;
        }
    }

    private void restartConnectionLostTimer() {
        cancelConnectionLostTimer();
        this.connectionLostTimer = new Timer("WebSocketTimer");
        this.connectionLostTimerTask = new TimerTask() { // from class: org.java_websocket.a.1
            private ArrayList<WebSocket> b = new ArrayList<>();

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.b.clear();
                try {
                    this.b.addAll(a.this.getConnections());
                    long currentTimeMillis = System.currentTimeMillis() - (a.this.connectionLostTimeout * 1500);
                    Iterator<WebSocket> it = this.b.iterator();
                    while (it.hasNext()) {
                        WebSocket next = it.next();
                        if (next instanceof d) {
                            d dVar = (d) next;
                            if (dVar.i() < currentTimeMillis) {
                                if (d.b) {
                                    PrintStream printStream = System.out;
                                    printStream.println("Closing connection due to no pong received: " + next.toString());
                                }
                                dVar.closeConnection(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
                            } else if (dVar.isOpen()) {
                                dVar.c();
                            } else if (d.b) {
                                PrintStream printStream2 = System.out;
                                printStream2.println("Trying to ping a non open connection: " + next.toString());
                            }
                        }
                    }
                } catch (Exception e) {
                    if (d.b) {
                        PrintStream printStream3 = System.out;
                        printStream3.println("Exception during connection lost ping: " + e.getMessage());
                    }
                }
                this.b.clear();
            }
        };
        Timer timer = this.connectionLostTimer;
        TimerTask timerTask = this.connectionLostTimerTask;
        int i = this.connectionLostTimeout;
        timer.scheduleAtFixedRate(timerTask, i * 1000, i * 1000);
    }

    public int getConnectionLostTimeout() {
        return this.connectionLostTimeout;
    }

    protected abstract Collection<WebSocket> getConnections();

    public boolean isReuseAddr() {
        return this.reuseAddr;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public void setConnectionLostTimeout(int i) {
        this.connectionLostTimeout = i;
        if (this.connectionLostTimeout <= 0) {
            if (d.b) {
                System.out.println("Connection lost timer stopped");
            }
            cancelConnectionLostTimer();
        } else if (!this.websocketRunning) {
        } else {
            if (d.b) {
                System.out.println("Connection lost timer restarted");
            }
            try {
                Iterator it = new ArrayList(getConnections()).iterator();
                while (it.hasNext()) {
                    WebSocket webSocket = (WebSocket) it.next();
                    if (webSocket instanceof d) {
                        ((d) webSocket).j();
                    }
                }
            } catch (Exception e) {
                if (d.b) {
                    PrintStream printStream = System.out;
                    printStream.println("Exception during connection lost restart: " + e.getMessage());
                }
            }
            restartConnectionLostTimer();
        }
    }

    public void setReuseAddr(boolean z) {
        this.reuseAddr = z;
    }

    public void setTcpNoDelay(boolean z) {
        this.tcpNoDelay = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startConnectionLostTimer() {
        if (this.connectionLostTimeout <= 0) {
            if (!d.b) {
                return;
            }
            System.out.println("Connection lost timer deactivated");
            return;
        }
        if (d.b) {
            System.out.println("Connection lost timer started");
        }
        this.websocketRunning = true;
        restartConnectionLostTimer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void stopConnectionLostTimer() {
        if (this.connectionLostTimer == null && this.connectionLostTimerTask == null) {
            return;
        }
        this.websocketRunning = false;
        if (d.b) {
            System.out.println("Connection lost timer stopped");
        }
        cancelConnectionLostTimer();
    }
}
