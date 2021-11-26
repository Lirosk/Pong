package com.example.l4.Game.GameEvents;

import com.example.l4.Game.Engine.Game;
import com.example.l4.Game.Updatable;

import java.util.Calendar;

public abstract class GameEvent implements ControllableGameEvent, Updatable {
    public long startTime = -1;
    protected Game game;

    public GameEvent(Game game) {
        this.game = game;
    }

    @Override
    public void start() {
        startTime = Calendar.getInstance().getTimeInMillis();
    }

    @Override
    protected void finalize() throws Throwable {
        stop();
        super.finalize();
    }
}
