package net.company.action;

/**
 * Action builder provides action for {@link ActionGenerator}. Each action builder will hold
 * a {@link net.company.strategy.ActionPKStrategy}, which will be used by each action.
 */
public interface ActionBuilder {
    /**
     * Build a action based on action name.
     *
     * @param actionName Action name.
     * @return An action. Null if action name is not supported or action name is null.
     */
    Action build(String actionName);
}
