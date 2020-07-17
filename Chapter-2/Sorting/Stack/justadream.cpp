#include <iostream>
#include <string>
#include <vector>
#include <map>

using namespace std;

char buf[100];

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    vector<string> event_stack;
    map<string, int> events;
    int n;
    cin >> n;
    for (int i=0;i<n;++i)
    {
        string t;
        cin >> t;
        if (t == "E")
        {
            string event;
            cin >> event;
            events[event] = event_stack.size();
            event_stack.push_back(event);
        }
        else if (t == "S")
        {
            int num;
            cin >> num;

            int min = -1;
            int max = event_stack.size();

            for (int j=0;j<num;++j)
            {
                while (cin.peek() == 32) { cin.read(buf, 1); }
                bool should_happen = !(cin.peek() == '!');
                if (!should_happen)
                {
                    char p;
                    cin.read(buf, 1);
                }

                string test_ev;
                cin >> test_ev;

                map<string, int>::iterator it = events.find(test_ev);
                bool has_happened = (it != events.end()) && (it->second < max);

                if (has_happened != should_happen)
                {
                    if (should_happen)
                        max = -1;
                    else
                        max = it->second;
                }
                else if (should_happen)
                {
                    if (it->second > min)
                        min = it->second;
                }
            }

            if (max == event_stack.size())
                cout << "Yes\n";
            else if (min >= max)
                cout << "Plot Error\n";
            else
                cout << (event_stack.size() - max) << " Just A Dream\n";
        }
        else if (t == "D")
        {
            int num;
            cin >> num;
            for (int j=0;j<num;++j)
            {
                events.erase(events.find(event_stack.back()));
                event_stack.pop_back();
            }
        }
    }
    return 0;
}