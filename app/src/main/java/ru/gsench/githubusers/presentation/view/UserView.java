package ru.gsench.githubusers.presentation.view;

import java.util.ArrayList;

import ru.gsench.githubusers.domain.github_repo.GitHubRepository;
import ru.gsench.githubusers.domain.github_repo.GitHubUser;
import ru.gsench.githubusers.domain.github_repo.GitHubUserShort;

/**
 * Created by grish on 09.05.2017.
 */

public interface UserView {
    public void init();
    public void setUser(GitHubUser param);
    public void setUserShort(GitHubUserShort userShort);
    public void setRepositories(ArrayList<GitHubRepository> param);
    public void closeView();
    public void showLoadingError();
    public void showParseError();
    public void showUnexpectedError();
}